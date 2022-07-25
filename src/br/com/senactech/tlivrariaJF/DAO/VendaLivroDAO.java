/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senactech.TLivrariaJF.DAO;

import br.com.senactech.TLivrariaJF.conexao.Conexao;
import br.com.senactech.tlivrariaJF.model.VendaLivro;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author João Vitor
 */
public class VendaLivroDAO {
    
    public void registrarVenda(VendaLivro vlVO) throws SQLException {
        Connection con = Conexao.getConnection();
        Statement stmt = con.createStatement();
        try {
            String sql;
            sql = "insert into compra values(null, " + vlVO.getIdCliente() + ","
                    + vlVO.getIdLivro() + ",'"
                    + vlVO.getDataVenda() + "',"
                    + vlVO.getQtd() + ","
                    + vlVO.getSubTotal() + ")";
            System.out.println(sql);
            stmt.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao registrar venda!" + e.getMessage());
        } finally {
            Conexao.closeConnection(con, stmt);
        }
    }
    
    public void deletarVenda(int idcompra) throws SQLException {
        Connection con = Conexao.getConnection();
        Statement stmt = con.createStatement();
        try {
            String sql;
            sql = "delete from compra where idcompra = " + idcompra;
            System.out.println(sql);
            stmt.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao deletar registro de venda! \n"
                    + e.getMessage());
        } finally {
            Conexao.closeConnection(con, stmt);
        }
    }
    
    public VendaLivro getByDocIDlivro(int idlivro) throws SQLException {
        Connection con = Conexao.getConnection();
        Statement stmt = con.createStatement();
        VendaLivro vl = new VendaLivro();
        try {
            String sql;
            sql = "select * from compra where idlivro = " + idlivro;
            System.out.println(sql);
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                vl.setIdcompra(rs.getInt("idcompra"));
                vl.setIdCliente(rs.getInt("idcliente"));
                vl.setIdLivro(rs.getInt("idlivro"));
                vl.setDataVenda(rs.getDate("dataCompra").toLocalDate());
                vl.setQtd(rs.getInt("quantCompra"));
                vl.setSubTotal(rs.getFloat("subTotal"));
            }
        } catch (SQLException e) {
            throw new SQLException("Comrpa com este ID não existe. \n"
                    + e.getMessage());
        } finally {
            Conexao.closeConnection(con, stmt);
        }
        return vl;
    }
    
}
