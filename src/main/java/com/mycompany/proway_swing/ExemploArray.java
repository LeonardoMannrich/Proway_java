/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proway_swing;

import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ExemploArray {

    public static void main(String[] args) {
        //exemplo01(); 
        exemplo02();
        
    }


    private static void exemplo01() throws HeadlessException {
        // String[] nomes = new String[2];
        // nomes[0] = "João";
        // nomes[1] = "Maria";
        
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("João"); // Adicionado elemento no ArrayList (vetor) na posição 0
        nomes.add("Maria"); // Adicionado elemento na posição 1
        nomes.add("Pedrinho");
        
        // Obter um elemento do ArrayList, necessário informar a posição desejada
        String primeiroNome = nomes.get(0);
        String segundoNome = nomes.get(1);
        String terceiroNome = nomes.get(2);
        
        // Obter a quantidade de elementos do ArrayList
        int quantidadeElementos = nomes.size();
        
        // Verificar se no ArrayList contém o nome Luiza
        boolean contemLuiza = nomes.contains("Luiza");
        
        nomes.add("Julhio");
        
        // Alterado o nome da Maria que está na posição 1 para Maria da Silva
        nomes.set(1, "Maria da Silva");
        
        // Remover um elemento do ArrayList
        boolean removeuComSucesso = nomes.remove("Julhio");
        
        JOptionPane.showMessageDialog(
                null,
                "Nome: " + primeiroNome +
                        "\nNome: " + segundoNome +
                        "\nNome: " + terceiroNome +
                        "\nQuantidade de pessoas: " + quantidadeElementos +
                        "\nExiste Luiza na lista: " + contemLuiza + 
                        "\nRemoveu Julhio com sucesso: " + removeuComSucesso
        );
    }

    private static void exemplo02() {
        var nomes = new ArrayList<String>();
        var quantidades = new ArrayList<Integer>();
        var precosUnitarios = new ArrayList<Double>();
        var precosPorProdutos = new ArrayList<Double>();
        
        var quantidadeDesejada = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade para cadastro"));

        // Solicitar o nome, quantidade e preço unitário para a quantidade 
        // de produtos que o usuário deseja cadastrar
        for (var i = 0; i < quantidadeDesejada; i++) {
            var nome = JOptionPane.showInputDialog("Digite o nome").trim();
            var quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade"));
            var precoUnitario = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço unitário"));
            nomes.add(nome);
            quantidades.add(quantidade);
            precosUnitarios.add(precoUnitario);
    }
        
        // Processar o preço total por produto
        for(var i = 0; i < quantidades.size(); i = i + 1){
            var quantidade = quantidades.get(i);
            var precoUnitario = precosUnitarios.get(i);
            var precoPorProduto = quantidade * precoUnitario;
            precosPorProdutos.add(precoPorProduto);
        }
        
        // Calcular o preço total dos pedidos
        var totalPedidos = 0.0;
        for(var i = 0; i < quantidades.size(); i = i + 1){
            totalPedidos = totalPedidos + precosPorProdutos.get(i);
        }
        
        JOptionPane.showMessageDialog(null, "Total dos pedidos: " + totalPedidos);
    }
    // Solicitar para o usuário nome, sobrenome de 3 usuário
    // Apresentar no final o nome completo, armazenado em outro ArrayList
    
    // Solicitar nome, altura e peso
    // Calcular o valor do imc armazenando em um ArrayList
    // Apresentar no final o nome, altura, peso e imc 
}