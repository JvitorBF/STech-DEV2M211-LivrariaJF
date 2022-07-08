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

    // Cadastrar
    //public void cadastrarCliente(Cliente cVO) throws SQLException {
    ////    Statement stat = con.createStatement();
    // }
    // Ler
    // Atualizar
    // Deletar
}
