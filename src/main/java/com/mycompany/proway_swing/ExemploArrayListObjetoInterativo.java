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
public class ExemploArrayListObjetoInterativo {

    private ArrayList<Produto> produtos = new ArrayList<>();// o eescopo é a instancia em si ou sejaa classe
    private int indiceAtual = 1;

    // CRUD (Create, Read, Update, Delete)
    public void apresentarMenu() {
        //Botão criar, editar, apagar, listar todos, ver detalhes escolhe por nome do produto
        var botoes = new String[]
        {"cadastrar", "Editar", "Apagar", "Listar todos","Produto menor preço", "Calcular total", "Sair"};

        var menuEscolhido = 0; //escopo da variavel é o método apresentar Menu
        var botaoSairIndice = botoes.length -1;
        while (menuEscolhido != botaoSairIndice && menuEscolhido != JOptionPane.CLOSED_OPTION) {
            menuEscolhido = JOptionPane.showOptionDialog(
                    null, "Escolha o menu desejado",
                    "Sistema proway",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    botoes,
                    "cadastrar");
            switch (menuEscolhido) {
                case 0:
                    cadastrar();
                    break;
                case 1:
                    editar();
                    break;
                case 2:
                    apagar();
                    break;
                case 3:
                    listar();
                    break;
                case 4:
                    apresentarProdutoMenorPreco();
                    break;
                case 5:
                    calcularTotal();
                    break;

            }
        }

    }

    public void cadastrar() {
        var produto = new Produto(); // escopo objeto é o método cadastrar
        produto.codigo = indiceAtual;
        produto.nome = JOptionPane.showInputDialog("Informe o nome");
        produto.quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade"));
        produto.precoUnitario = Double.parseDouble(JOptionPane.showInputDialog("informe o preço unitário"));
        indiceAtual = indiceAtual + 1;
        produtos.add(produto);
    }

    public void editar() {
        var nomeProdutos = new ArrayList<String>();
        for (int i = 0; i < produtos.size(); i++) {
            var produto = produtos.get(i);
            nomeProdutos.add(produto.codigo + " - " + produto.nome);
        }
        var produtoEscolhido = JOptionPane.showInputDialog(null,
                "Escolha o produto a ser alterado",
                "Sistema Proway",
                JOptionPane.WARNING_MESSAGE,
                null,
                nomeProdutos.toArray(),
                "");

        if (produtoEscolhido == null) {
            return;
        }
        for (int i = 0; i < produtos.size(); i++) {
            var produto = produtos.get(i);
            if (produtoEscolhido.equals(produto.codigo + " - " + produto.nome)) {
                produto.nome = JOptionPane.showInputDialog(null, "Informe o nome", produto.nome);
                produto.quantidade = Integer.parseInt(JOptionPane.showInputDialog(
                        null,
                        "Informe a quantidade",
                        produto.quantidade));
                produto.precoUnitario = Double.parseDouble(
                        JOptionPane.showInputDialog(null,
                                "Informe o preço unitário",
                                produto.precoUnitario));

            }
        }
    }

    public void apagar() {
        var nomeProdutos = new ArrayList<String>();
        for (int i = 0; i < produtos.size(); i++) {
            var produto = produtos.get(i);
            nomeProdutos.add(produto.codigo + " - " + produto.nome);
        }
        var produtoEscolhido = JOptionPane.showInputDialog(
                null,
                "Escolha o produto a ser apaagdo",
                "Sistemas Proway",
                JOptionPane.WARNING_MESSAGE,
                null,
                nomeProdutos.toArray(),
                "");

        if (produtoEscolhido == null) {
            JOptionPane.showMessageDialog(null, "Seus produtos não foram excluidos");
            return;

        }
        for (var i = 0; i < produtos.size(); i++) {
            var produto = produtos.get(i);
            if (produtoEscolhido.equals(produto.codigo + " - " + produto.nome)) {
                produtos.remove(produto);
                JOptionPane.showMessageDialog(null, "produto removido com sucesso");
                break;
            }
        }
    }

    public void listar() {
        var texto = "";
        //percorrendo cada uma das posições do ArrayList de produtos
        for (var i = 0; i < produtos.size(); i++) {
            var produto = produtos.get(i);
            texto += "nome: " + produto.nome
                    + " Quantidade: " + produto.quantidade
                    + " Preço unitario: " + produto.precoUnitario
                    + " preço total: " + produto.calcularpreco() + "\n";
        }
        JOptionPane.showMessageDialog(null, texto);
    }
    public void calcularTotal(){
        var total = 0.0;
        for (int i = 0; i < produtos.size(); i++) {
            var Produto = produtos.get(i);
            total = total + Produto.calcularpreco();
        }
    }
        public void apresentarProdutoMenorPreco() {
            var nomeProdutoMenorPreco = "";
            var menorPreco = Double.MAX_VALUE;
            for (int i = 0; i < produtos.size(); i++) {
                var produto = produtos.get (i);
                
                if (produto.precoUnitario < menorPreco){
                    menorPreco = produto.precoUnitario;
                    nomeProdutoMenorPreco = produto.nome;
                }
            }
            JOptionPane.showConfirmDialog(null, "o produto " + nomeProdutoMenorPreco + " Possui o menor preço unitário " + menorPreco);
        }
    

    public static void main(String[] args) {
        new ExemploArrayListObjetoInterativo().apresentarMenu();
    }
}
//criar CRUD utilizando ArrayList para a classe Aluno
//criar a classe ExercicioArrayListAlunoInterativo
