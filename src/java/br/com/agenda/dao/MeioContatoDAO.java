/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agenda.dao;

import br.com.agenda.model.Meiocontato;
import br.com.agenda.util.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author User
 */
public class MeioContatoDAO {

    public void salvar(Meiocontato meioContato) {
        // cria e abre uma sessão
        Session session = HibernateUtil.getSessionFactory().openSession();
        //inicia uma transição
        session.beginTransaction();

        //realiza a operação de salvar
        session.persist(meioContato);

        //comita a operação de salvar
        session.getTransaction().commit();

        //libera a memória
        session.flush();

        //fecha a sessão.
        session.close();
    }

    public void deletar(Integer id) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        Meiocontato meioContato = (Meiocontato) session.get(Meiocontato.class, id);

        session.delete(meioContato);

        session.getTransaction().commit();

        session.close();
    }

    public Meiocontato pesquisarPorId(Integer id) {
        Session sessao = HibernateUtil.getSessionFactory().openSession();

        sessao.beginTransaction();

        Meiocontato meioContato = (Meiocontato) sessao.get(Meiocontato.class, id);

        sessao.getTransaction().commit();

        sessao.close();

        return meioContato;
    }

    public void Atualizar(Meiocontato meioContato) {
        // cria e abre uma sessão
        Session session = HibernateUtil.getSessionFactory().openSession();
        //inicia uma transição
        session.beginTransaction();
        //realiza a operação de salvar
        session.update(meioContato);
        //comita a operação de salvar
        session.getTransaction().commit();

        //libera a memória
        session.flush();

        //fecha a sessão.
        session.close();
    }

}
