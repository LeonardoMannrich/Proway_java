/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proway_swing;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 74703
 */
public class ExemploArrayListObjeto {
    public void exemploArrayListProdutos(){
        var produtos = new ArrayList<Alunos>();
        
        //instanciando um objeto de produto
        var produtoXbox = new Alunos();
        // Definindo valor para os atributos do produto
        produtoXbox.nome = "Xbox";
        produtoXbox.quantidade = 2;
        produtoXbox.precoUnitario = 2390.20;
        // Adicionado o objeto no ArrayList de produtos
        produtos.add(produtoXbox);
        
        var ProdutoPs5 = new Alunos();
        ProdutoPs5.nome = "PS5";
        ProdutoPs5.precoUnitario = 3300.00;
        ProdutoPs5.quantidade = 1;
        produtos.add(ProdutoPs5);
        
        // obter o primeiro produtoda lista de produtos
        var primeiroProduto = produtos.get(0); //Xbox
        JOptionPane.showMessageDialog(null, primeiroProduto.nome);
        
    }
        public static void main(String[] args) {
            new ExemploArrayListObjeto().exemploArrayListProdutos();
        }
        
        
    
    
}
