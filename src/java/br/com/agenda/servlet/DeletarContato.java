/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agenda.servlet;

import br.com.agenda.dao.ContatoDAO;
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
@WebServlet(name = "DeletarContato", urlPatterns = {"/DeletarContato"})
public class DeletarContato extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String contId = req.getParameter("id");

        Integer id = Integer.parseInt(contId);

        ContatoDAO dao = new ContatoDAO();

        PrintWriter out = resp.getWriter();

        dao.deletar(id);

        out.println("<script>");
        out.println("window.location.href = 'menuPrincipal.jsp';");
        out.println("</script>");
    }
}
