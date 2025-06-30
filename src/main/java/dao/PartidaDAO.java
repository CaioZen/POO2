/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dominio.Partida;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Caio
 */
public class PartidaDAO extends DaoGenerico {

    public Long contarPartidasPorIdHis(int idHis) throws HibernateException {
        Long quantidade = 0L;
        Session sessao = null;

        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery<Long> consulta = builder.createQuery(Long.class);
            Root<Partida> tabela = consulta.from(Partida.class);

            
            consulta.select(builder.count(tabela));
            Predicate restricao = builder.equal(tabela.get("historia").get("idHis"), idHis);
            consulta.where(restricao);

            quantidade = sessao.createQuery(consulta).getSingleResult();

            sessao.getTransaction().commit();
        } catch (HibernateException ex) {
            if (sessao != null) {
                sessao.getTransaction().rollback();
            }
            throw new HibernateException(ex);
        } finally {
            if (sessao != null) {
                sessao.close();
            }
        }

        return quantidade;
    }

}
