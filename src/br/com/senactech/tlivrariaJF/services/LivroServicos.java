/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senactech.TLivrariaJF.services;

import br.com.senactech.TLivrariaJF.DAO.DAOFactory;
import br.com.senactech.TLivrariaJF.DAO.LivroDAO;
import br.com.senactech.tlivrariaJF.model.Livro;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author João Vitor
 */
public class LivroServicos {

    public ArrayList<Livro> buscarLivro() throws SQLException {
        LivroDAO lDAO = DAOFactory.getLivroDAO();
        return lDAO.selectLivro();
    }

    public void cadastrarLivro(Livro lVO) throws SQLException {
        LivroDAO lDAO = DAOFactory.getLivroDAO();
        lDAO.cadastrarLivro(lVO);
    }

    public void atualizarLivro(Livro lVO) throws SQLException {
        LivroDAO lDAO = DAOFactory.getLivroDAO();
        lDAO.atualizarLivro(lVO);
    }

    public void deletarLivro(int id) throws SQLException {
        LivroDAO lVO = DAOFactory.getLivroDAO();
        lVO.deletarLivro(id);
    }

    public Livro getByDocISBN(String isbn) throws SQLException {
        LivroDAO lDAO = DAOFactory.getLivroDAO();
        return lDAO.getByDocISBN(isbn);
    }

    public Livro getByDocID(int id) throws SQLException {
        LivroDAO lDAO = DAOFactory.getLivroDAO();
        return lDAO.getByDocID(id);
    }

    public boolean verISBN(String isbn) throws SQLException {
        LivroDAO lDAO = DAOFactory.getLivroDAO();
        return lDAO.verISBN(isbn);
    }

    public void somarEstoque(int idlivro, int qtd) throws SQLException {
        LivroDAO lVO = DAOFactory.getLivroDAO();
        lVO.somarEstoque(idlivro, qtd);
    }

    public void subtrairEstoque(int idlivro, int qtd) throws SQLException {
        LivroDAO lVO = DAOFactory.getLivroDAO();
        lVO.subtrairEstoque(idlivro, qtd);
    }

}
