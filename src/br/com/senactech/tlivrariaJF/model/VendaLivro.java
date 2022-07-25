/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senactech.tlivrariaJF.model;

import java.time.LocalDate;

/**
 *
 * @author jvitorbarbosa
 */
public class VendaLivro {

    private int idcompra;
    private int idcliente;
    private int idlivro;
    private int quantCompra;
    private float subTotal;
    private LocalDate dataCompra;

    public VendaLivro() {
    }

    public VendaLivro(int idcompra, int idcliente, int idlivro, int quantCompra, float subTotal, LocalDate dataCompra) {
        this.idcompra = idcompra;
        this.idcliente = idcliente;
        this.idlivro = idlivro;
        this.quantCompra = quantCompra;
        this.subTotal = subTotal;
        this.dataCompra = dataCompra;
    }

    public int getIdcompra() {
        return idcompra;
    }

    public void setIdcompra(int idcompra) {
        this.idcompra = idcompra;
    }

    public int getIdCliente() {
        return idcliente;
    }

    public void setIdCliente(int idCliente) {
        this.idcliente = idCliente;
    }

    public int getIdLivro() {
        return idlivro;
    }

    public void setIdLivro(int idLivro) {
        this.idlivro = idLivro;
    }

    public int getQtd() {
        return quantCompra;
    }

    public void setQtd(int qtd) {
        this.quantCompra = qtd;
    }

    public float getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(float subTotal) {
        this.subTotal = subTotal;
    }

    public LocalDate getDataVenda() {
        return dataCompra;
    }

    public void setDataVenda(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }

    @Override
    public String toString() {
        return "vendaLivro{" + "idcompra=" + idcompra + "idcliente=" + idcliente + ", idlivro=" + idlivro + ", quantCompra=" + quantCompra + ", subTotal=" + subTotal + ", dataCompra=" + dataCompra + '}';
    }
}
