/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dominio.Historia;
import dominio.PersonagensHistoria;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Caio
 */
public class HistoriaDAO extends DaoGenerico{
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

    
}
