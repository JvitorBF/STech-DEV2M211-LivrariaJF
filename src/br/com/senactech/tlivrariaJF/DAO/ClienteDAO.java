/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senactech.TLivrariaJF.DAO;

import br.com.senactech.tlivrariaJF.model.Cliente;
import br.com.senactech.TLivrariaJF.conexao.Conexao;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.SQLException;

/**
 *
 * @author João Vitor
 */
public class ClienteDAO {

    public ArrayList<Cliente> selectCliente() throws SQLException {
        Connection con = Conexao.getConnection();
        Statement stmt = con.createStatement();
        try {
            String sql;
            sql = "select * from cliente";
            ResultSet rs = stmt.executeQuery(sql);
            ArrayList<Cliente> clientes = new ArrayList<>();
            while (rs.next()) {
                Cliente c = new Cliente();
                c.setIdcliente(rs.getInt("idcliente"));
                c.setNome(rs.getString("nome"));
                c.setEndereco(rs.getString("enderecoCompleto"));
                c.setTelefone(rs.getString("telefone"));
                c.setCpf(rs.getString("cpf"));
                c.setCnpj(rs.getString("cnpj"));
                clientes.add(c);
            }
            return clientes;
        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar Clientes" + e.getMessage());
        } finally {
            Conexao.closeConnection(con, stmt);
        }
    }

    public void cadastrarClienteCPF(Cliente cVO) throws SQLException {
        Connection con = Conexao.getConnection();
        Statement stmt = con.createStatement();
        try {
            String sql;
            sql = "insert into cliente values (null,'" + cVO.getNome() + "','"
                    + cVO.getCpf() + "',"
                    + "null,'"
                    + cVO.getEndereco() + "','"
                    + cVO.getTelefone() + "')";
            System.out.println(sql);
            stmt.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao cadastrar cliente Físico!" + e.getMessage());
        } finally {
            con.close();
            stmt.close();
        }
    }

    public void cadastrarClienteCNPJ(Cliente cVO) throws SQLException {
        Connection con = Conexao.getConnection();
        Statement stmt = con.createStatement();
        try {
            String sql;
            sql = "insert into cliente values (null,'" + cVO.getNome() + "',"
                    + "null,'"
                    + cVO.getCnpj() + "','"
                    + cVO.getEndereco() + "','"
                    + cVO.getTelefone() + "')";
            System.out.println(sql);
            stmt.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao cadastrar cliente Jurídico!" + e.getMessage());
        } finally {
            con.close();
            stmt.close();
        }
    }

    public void atualizarCliente(Cliente cVO) throws SQLException {
        Connection con = Conexao.getConnection();
        Statement stmt = con.createStatement();
        try {
            String sql;
            sql = "update cliente set"
                    + "nome = '" + cVO.getNome() + "',"
                    + "cpf = '" + cVO.getCpf() + "',"
                    + "cnpj = '" + cVO.getCnpj() + "',"
                    + "enderecoCompleto = '" + cVO.getEndereco() + "',"
                    + "telefone = '" + cVO.getTelefone() + "'";
            stmt.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao atualizar cliente! " + e.getMessage());
        } finally {
            Conexao.closeConnection(con, stmt);
        }
    }

    public void deletarCliente(int id) throws SQLException {
        Connection con = Conexao.getConnection();
        Statement stmt = con.createStatement();

        try {
            String sql;
            sql = "delete from cliente where idcliente = " + id;
            stmt.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao deletar cliente! " + e.getMessage());
        } finally {
            Conexao.closeConnection(con, stmt);
        }
    }

    // Ler
    // Deletar
}
