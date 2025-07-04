/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dominio.Personagem;
import java.util.List;
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
public class PersonagemDAO extends DaoGenerico {

    public List<Personagem> listarDisponiveis() throws HibernateException {
        List<Personagem> lista = null;
        Session sessao = null;

        //Após uma longa briga e vários inputs no ChatGPT, eu e ele decidimos que é melhor usar o HQL nesse caso
        //Justificativa do GPT:
        //Use a opção 1 com HQL — mais simples, mais robusta, mais confiável para o seu caso. Ela respeita o estado real dos dados no banco, sem depender de mapeamentos @OneToOne ou cache.
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            String hql = "FROM Personagem p WHERE p.idPer NOT IN (SELECT ph.personagem.idPer FROM PersonagensHistoria ph)";
            lista = sessao.createQuery(hql, Personagem.class).getResultList();

            sessao.getTransaction().commit();
        } catch (HibernateException ex) {
            if (sessao != null && sessao.getTransaction().isActive()) {
                sessao.getTransaction().rollback();
            }
            throw new HibernateException("Erro ao buscar personagens disponíveis", ex);
        } finally {
            if (sessao != null) {
                sessao.close();
            }
        }

        return lista;
    }
    
    public List<Personagem> pesquisar(String text) {
        List lista = null;
        Session sessao = null;

        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            // OPERAÇÃO
            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery(Personagem.class);
            Root tabela = consulta.from(Personagem.class);

            //Restrições
            Predicate restricoes = builder.like(builder.lower(tabela.get("nome")), text.toLowerCase() + '%');
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
    public List<Personagem> pesquisarRelatorio() throws HibernateException {
        List lista = null;
        Session sessao = null;

        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            // OPERAÇÃO
            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery(Personagem.class);
            Root tabela = consulta.from(Personagem.class);

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
