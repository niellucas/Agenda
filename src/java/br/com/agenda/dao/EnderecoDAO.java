/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agenda.dao;

import br.com.agenda.model.Endereco;
import br.com.agenda.util.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author User
 */
public class EnderecoDAO {
    
     public void salvar(Endereco endereco) {
        // cria e abre uma sessão
        Session session = HibernateUtil.getSessionFactory().openSession();
        //inicia uma transição
        session.beginTransaction();

        //realiza a operação de salvar
        session.persist(endereco);

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

        Endereco endereco = (Endereco) session.get(Endereco.class, id);

        session.delete(endereco);

        session.getTransaction().commit();

        session.close();
    }

    public Endereco pesquisarPorId(Integer id) {
        Session sessao = HibernateUtil.getSessionFactory().openSession();

        sessao.beginTransaction();

        Endereco endereco = (Endereco) sessao.get(Endereco.class, id);

        sessao.getTransaction().commit();

        sessao.close();

        return endereco;
    }

    public void Atualizar(Endereco endereco) {
        // cria e abre uma sessão
        Session session = HibernateUtil.getSessionFactory().openSession();
        //inicia uma transição
        session.beginTransaction();
        //realiza a operação de salvar
        session.update(endereco);
        //comita a operação de salvar
        session.getTransaction().commit();

        //libera a memória
        session.flush();

        //fecha a sessão.
        session.close();
    }

}
