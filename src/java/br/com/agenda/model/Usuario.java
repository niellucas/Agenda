package br.com.agenda.model;
// Generated 24/06/2019 23:04:18 by Hibernate Tools 4.3.1



/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private Integer idUsuario;
     private String nome;
     private String login;
     private String senha;

    public Usuario() {
    }

    public Usuario(String nome, String login, String senha) {
       this.nome = nome;
       this.login = login;
       this.senha = senha;
    }
   
    public Integer getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getLogin() {
        return this.login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    public String getSenha() {
        return this.senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }




}


