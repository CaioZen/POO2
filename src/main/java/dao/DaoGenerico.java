/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;
import javax.persistence.criteria.CriteriaQuery;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author 2023122760123
 */
public class DaoGenerico {

    public void inserir(Object objeto) {
        Session sessao = null;
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            sessao.save(objeto);

            sessao.getTransaction().commit();
            sessao.close();
        } catch (HibernateException ex) {
            if (sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(ex);
        }
    }

    public void alterar(Object objeto) {
        Session sessao = null;
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            sessao.update(objeto);

            sessao.getTransaction().commit();
            sessao.close();
        } catch (HibernateException ex) {
            if (sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(ex);
        }
    }

    public void excluir(Object objeto) throws HibernateException {
        Session sessao = null;
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            sessao.delete(objeto);

            sessao.getTransaction().commit();
            sessao.close();
        } catch (HibernateException ex) {
            if (sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(ex);
        }
    }

    public List listar(Class classe) throws HibernateException {
        List lista = null;
        Session sessao = null;

        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();
            // OPERAÇÃO
            CriteriaQuery consulta = sessao.getCriteriaBuilder().createQuery(classe);
            consulta.from( classe );
            lista = sessao.createQuery(consulta).getResultList();
            
            
            sessao.getTransaction().commit();
            sessao.close();
        } catch ( HibernateException ex) {
            if ( sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(ex);
        }

        return lista;
        }
   }

