package br.com.agenda.model;

public class Endereco  implements java.io.Serializable {


     private Integer idEndereco;
     private String endereco;
     private String numero;
     private String complemento;
     private String bairro;
     private String cidade;
     private String uf;
     private String tipoEndereco;

    public Endereco() {
    }

	
    public Endereco(String endereco, String bairro, String cidade, String uf, String tipoEndereco) {
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.tipoEndereco = tipoEndereco;
    }
    public Endereco(String endereco, String numero, String complemento, String bairro, String cidade, String uf, String tipoEndereco) {
       this.endereco = endereco;
       this.numero = numero;
       this.complemento = complemento;
       this.bairro = bairro;
       this.cidade = cidade;
       this.uf = uf;
       this.tipoEndereco = tipoEndereco;
    }
   
    public Integer getIdEndereco() {
        return this.idEndereco;
    }
    
    public void setIdEndereco(Integer idEndereco) {
        this.idEndereco = idEndereco;
    }
    public String getEndereco() {
        return this.endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getNumero() {
        return this.numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getComplemento() {
        return this.complemento;
    }
    
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public String getBairro() {
        return this.bairro;
    }
    
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getCidade() {
        return this.cidade;
    }
    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getUf() {
        return this.uf;
    }
    
    public void setUf(String uf) {
        this.uf = uf;
    }
    public String getTipoEndereco() {
        return this.tipoEndereco;
    }
    
    public void setTipoEndereco(String tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
    }




}


