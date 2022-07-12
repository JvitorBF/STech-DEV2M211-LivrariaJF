/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senactech.TLivrariaJF.services;

import br.com.senactech.TLivrariaJF.DAO.ClienteDAO;
import br.com.senactech.TLivrariaJF.DAO.DAOFactory;
import br.com.senactech.tlivrariaJF.model.Cliente;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author João Vitor
 */
public class ClienteServicos {

    public ArrayList<Cliente> buscarCliente() throws SQLException {
        ClienteDAO cDAO = DAOFactory.getClienteDAO();
        return cDAO.selectCliente();
    }

    public void cadastrarClienteCPF(Cliente cVO) throws SQLException {
        ClienteDAO cDAO = DAOFactory.getClienteDAO();
        cDAO.cadastrarClienteCPF(cVO);
    }
    
    public void cadastrarClienteCNPJ (Cliente cVO) throws SQLException {
        ClienteDAO cDAO = DAOFactory.getClienteDAO();
        cDAO.cadastrarClienteCNPJ(cVO);
    }

}
