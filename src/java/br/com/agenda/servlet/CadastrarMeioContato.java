/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agenda.servlet;

import br.com.agenda.dao.MeioContatoDAO;
import br.com.agenda.model.Meiocontato;
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
@WebServlet(name = "CadastrarMeioContato", urlPatterns = {"/CadastrarMeioContato"})
public class CadastrarMeioContato extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Meiocontato meio = new Meiocontato();
        meio.setTipoContato(req.getParameter("tipoContato"));
        meio.setConteudo(req.getParameter("conteudo"));

        MeioContatoDAO dao = new MeioContatoDAO();
        dao.salvar(meio);

        PrintWriter out = resp.getWriter();
        out.println("<script>");
        out.println("window.location.href = 'menuPrincipal.jsp';");
        out.println("</script>");

    }
}
