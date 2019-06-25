/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agenda.servlet;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
@WebServlet(name = "AtualizarContato", urlPatterns = {"/AtualizarContato"})
public class AtualizarContato extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Contato contato = new Contato();
        ContatoDAO dao = new ContatoDAO();
        contato.setNome(req.getParameter("nome"));
        contato.setCargo(req.getParameter("cargo"));
        contato.setEmpresa(req.getParameter("empresa"));
        contato.setDataAniversario(req.getParameter("dataAniversario"));

        String contId = req.getParameter("idContato");

        Integer id = Integer.parseInt(contId);
        contato.setIdContato(id);

        dao.Atualizar(contato);

        PrintWriter out = resp.getWriter();
        out.println("<script>");
        out.println("window.location.href = 'menuPrincipal.jsp';");
        out.println("</script>");
    }

}
