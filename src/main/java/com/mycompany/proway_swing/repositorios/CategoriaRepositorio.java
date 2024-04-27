/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proway_swing.repositorios;

import com.mycompany.proway_swing.bancoDados.Banco;
import com.mycompany.proway_swing.entidades.Categoria;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 74703
 */
public class CategoriaRepositorio {

    public void inserir(String nome) {
        try {
            var conexao = Banco.conectar();
            String query = "INSERT INTO categorias (nome) VALUES (?)";
            var prepareStatement = conexao.prepareStatement(query);
            prepareStatement.setString(1, nome);
            prepareStatement.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public void alterar(int id, String nome) {
        try {
            var conexao = Banco.conectar();
            var query = "UPDATE categorias SET nome = ? WHERE id = ?";
            var prepareStatement = conexao.prepareStatement(query);
            prepareStatement.setString(1, nome);
            prepareStatement.setInt(2, id);
            prepareStatement.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void apagar(int id) {
        try {
            var conexao = Banco.conectar();
            var query = "DELETE FROM categorias WHERE id = ?";
            var prepareStatement = conexao.prepareStatement(query);
            prepareStatement.setInt(1, id);
            prepareStatement.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<Categoria> obterTodos() {
        var categorias = new ArrayList<Categoria>();
        try {
            var conexao = Banco.conectar();
            var query = "SELECT id, nome FROM categorias";
            var statement = conexao.createStatement();
            var dados = statement.executeQuery(query); // Tipo ResultSet
            while (dados.next()) {
                var id = Integer.parseInt(dados.getString("id"));
                var nome = dados.getString("nome");
                var categoria = new Categoria();
                categoria.id = id;
                categoria.nome = nome;
                categorias.add(categoria);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return categorias;
    }

}
