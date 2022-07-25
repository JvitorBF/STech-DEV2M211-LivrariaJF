/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senactech.TLivrariaJF.services;

import br.com.senactech.TLivrariaJF.DAO.DAOFactory;
import br.com.senactech.TLivrariaJF.DAO.VendaLivroDAO;
import br.com.senactech.tlivrariaJF.model.VendaLivro;
import java.sql.SQLException;

/**
 *
 * @author João Vitor
 */
public class VendaLivroServicos {

    public void registrarVenda(VendaLivro lVO) throws SQLException {
        VendaLivroDAO vlDAO = DAOFactory.getVendaLivroDAO();
        vlDAO.registrarVenda(lVO);
    }

    public void deletarVenda(int idcompra) throws SQLException {
        VendaLivroDAO vlDAO = DAOFactory.getVendaLivroDAO();
        vlDAO.deletarVenda(idcompra);
    }

    public VendaLivro getByDocIDlivro(int idlivro) throws SQLException {
        VendaLivroDAO vlDAO = DAOFactory.getVendaLivroDAO();
        return vlDAO.getByDocIDlivro(idlivro);
    }
}
