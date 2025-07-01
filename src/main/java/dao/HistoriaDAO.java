/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dominio.Historia;
import dominio.PersonagensHistoria;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Caio
 */
public class HistoriaDAO extends DaoGenerico {

    public Historia carregarListaPersonagens(Historia his) throws HibernateException {
        Session sessao = null;

        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            Historia hisTemp = sessao.get(Historia.class, his.getIdHis());
            Hibernate.initialize(hisTemp.getListaPersonagens());

            for (PersonagensHistoria ph : hisTemp.getListaPersonagens()) {
                Hibernate.initialize(ph.getPartidas());
            }

            sessao.getTransaction().commit();
            return hisTemp;
        } catch (HibernateException erro) {
            if (sessao != null) {
                sessao.getTransaction().rollback();
            }
            throw new HibernateException(erro);
        } finally {
            if (sessao != null && sessao.isOpen()) {
                sessao.close();
            }
        }
    }
    public List<Historia> pesquisarRelatorio() throws HibernateException {
        List lista = null;
        Session sessao = null;

        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            // OPERAÇÃO
            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery(Historia.class);
            Root tabela = consulta.from(Historia.class);

            // Executar a query
            lista = sessao.createQuery(consulta).getResultList();

            sessao.getTransaction().commit();
            sessao.close();
        } catch (HibernateException ex) {
            if (sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(ex);
        }

        return lista;

    }

}
