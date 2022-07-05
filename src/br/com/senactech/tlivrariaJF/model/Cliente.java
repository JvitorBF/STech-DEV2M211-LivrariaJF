/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senactech.tlivrariaJF.model;

/**
 *
 * @author jvitorbarbosa
 */
public class Cliente {
    private int idcliente;
    private String nome;
    private String cpf;
    private String cnpj;
    private String enderecoCompleto;
    private String telefone;

    public Cliente() {
        //Construtor Vazio para acessar os metodos acessores get e set
    }
    
    /**
     * Contrutor Cliente
     * @param idCliente
     * @param nomeCliente
     * @param cpf
     * @param cnpj
     * @param endereco
     * @param telefone 
     */
    public Cliente(int idCliente, String nomeCliente, String cpf, String cnpj, String endereco, String telefone) {
        this.idcliente = idCliente;
        this.nome = nomeCliente;
        this.cpf = cpf;
        this.cnpj = cnpj;
        this.enderecoCompleto = endereco;
        this.telefone = telefone;
    }

    /**
     * @return the idcliente
     */
    public int getIdCliente() {
        return idcliente;
    }

    /**
     * @param idCliente the idcliente to set
     */
    public void setIdCliente(int idCliente) {
        this.idcliente = idCliente;
    }

    /**
     * @return the nome
     */
    public String getNomeCliente() {
        return nome;
    }

    /**
     * @param nomeCliente the nome to set
     */
    public void setNomeCliente(String nomeCliente) {
        this.nome = nomeCliente;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the enderecoCompleto
     */
    public String getEndereco() {
        return enderecoCompleto;
    }

    /**
     * @param endereco the enderecoCompleto to set
     */
    public void setEndereco(String endereco) {
        this.enderecoCompleto = endereco;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    @Override
    public String toString() {
        return "cliente{" + "idCliente=" + idcliente + ", nomeCliente=" + nome + ", cpf=" + cpf + ", cnpj=" + cnpj + ", endereco=" + enderecoCompleto + ", telefone=" + telefone + '}';
    }
    
    
    
}
