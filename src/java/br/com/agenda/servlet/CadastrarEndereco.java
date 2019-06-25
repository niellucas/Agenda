/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agenda.servlet;

import br.com.agenda.dao.EnderecoDAO;
import br.com.agenda.model.Endereco;
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
@WebServlet(name = "CadastrarEndereco", urlPatterns = {"/CadastrarEndereco"})
public class CadastrarEndereco extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Endereco endereco = new Endereco();
        endereco.setEndereco(req.getParameter("endereco"));
        endereco.setNumero(req.getParameter("numero"));
        endereco.setComplemento(req.getParameter("complemento"));
        endereco.setBairro(req.getParameter("bairro"));
        endereco.setCidade(req.getParameter("cidade"));
        endereco.setUf(req.getParameter("uf"));
        endereco.setTipoEndereco(req.getParameter("tipoEndereco"));

        EnderecoDAO dao = new EnderecoDAO();

        dao.salvar(endereco);

        PrintWriter out = resp.getWriter();
        out.println("<script>");
        out.println("window.location.href = 'menuPrincipal.jsp';");
        out.println("</script>");
    }

}
