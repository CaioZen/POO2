/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dominio.Usuario;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author 2023122760123
 */
public class UsuarioDAO extends DaoGenerico {

    public List<Usuario> pesquisar(String pesq) throws HibernateException {
        List lista = null;
        Session sessao = null;

        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            // OPERAÇÃO
            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery(Usuario.class);
            Root tabela = consulta.from(Usuario.class);

            //Restrições
            Predicate restricoes = builder.like(builder.lower(tabela.get("nome")), pesq.toLowerCase() + '%');
            consulta.where(restricoes);

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
    public List<Usuario> pesquisarRelatorio() throws HibernateException {
        List lista = null;
        Session sessao = null;

        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            // OPERAÇÃO
            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery(Usuario.class);
            Root tabela = consulta.from(Usuario.class);

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

    public Usuario carregarListasUsuario(Usuario usuario) throws HibernateException {
        Session sessao = null;

        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            
            Usuario usuarioTemp = sessao.get(Usuario.class, usuario.getIdUsr());

            
            Hibernate.initialize(usuarioTemp.getPersonagens());
            Hibernate.initialize(usuarioTemp.getHistorias());

            sessao.getTransaction().commit();
            return usuarioTemp;
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

}
