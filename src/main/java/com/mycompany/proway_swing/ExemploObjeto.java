/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proway_swing;

import javax.swing.JOptionPane;

/**
 *
 * @author 74703
 */
public class ExemploObjeto {

    public void executar() {
        // Instanciando(new) um objeto chamado xbox da classe produtos
        var xbox = new produto();
        // definindo valor para os atributos do objeto xbox
        xbox.nome = "xbox series x";
        xbox.quantidade = 2;
        xbox.precounitario = 3500.00;
        // chamando o método calcularpreco do objeto xbox
        var precoxbox = xbox.calcularpreco();

        var ps5 = new produto();
        ps5.nome = "playstation 5";
        ps5.precounitario = 3300.00;
        ps5.quantidade = 4;
        var precops5 = ps5.calcularpreco();

        //alterado o preço do ps5
        ps5.precounitario = 3150.99;

        JOptionPane.showMessageDialog(null,
                "nome: " + xbox.nome
                + "\nquantidade: " + xbox.quantidade
                + "\npreço unitario: " + xbox.precounitario
                + "\n\nnome: " + ps5.nome
                + "\nquantidade: " + ps5.quantidade
                + "\npreço unitário: " + ps5.precounitario
                + "\n preco produto 2: " + precops5);

    }

    public void executarAluno() {
        // instanciar um objeto do aluno
        var thiago = new Aluno();
        thiago.nome = "Thiago com H";
        thiago.CPF = "456.789.123-30";
        thiago.nota1 = 5.0;
        thiago.nota2 = 3.0;
        thiago.nota3 = 7.4;
        var mediaThiago = thiago.calcularMedia();
        var statusThiago = thiago.obterStatus();

        var leonardo = new Aluno();
        leonardo.nome = "Leonardo com D";
        leonardo.CPF = "986.213.530-29";
        leonardo.nota1 = 4.0;
        leonardo.nota2 = 0.2;
        leonardo.nota3 = 10.0;

        JOptionPane.showMessageDialog(
                null,
                "Aluno 1: " + thiago.nome
                + "\nCPF: " + thiago.CPF
                + "\nMédia: " + mediaThiago
                + "\nStatus: " + statusThiago
                + "\n\nAluno 2: " + leonardo.nome
                + "\nCPF: " + leonardo.CPF
                + "\nMédia: " + leonardo.calcularMedia()
                + "\nstatus: " + leonardo.obterStatus());

    }

    public void executarAlunoEnsinoMedio() {
        // instanciar um objeto do aluno
        var thiago = new AlunoEnsinoMedio();
        thiago.nome = "Thiago com H";
        thiago.CPF = "456.789.123-30";
        thiago.adicionarNota(5.0);
        thiago.adicionarNota(8.0);
        thiago.adicionarNota(6.5);
        var mediaThiago = thiago.calcularMedia();
        var statusThiago = thiago.obterStatus();

        var leonardo = new AlunoEnsinoMedio();
        leonardo.nome = "Leonardo com D";
        leonardo.CPF = "986.213.530-29";
        leonardo.adicionarNota(4.0);
        leonardo.adicionarNota(0.2);
        leonardo.adicionarNota(10.0);

        JOptionPane.showMessageDialog(
                null,
                "Aluno 1: " + thiago.nome
                + "\nCPF: " + thiago.CPF
                + "\nMédia: " + mediaThiago
                + "\nStatus: " + statusThiago
                + "\n\nAluno 2: " + leonardo.nome
                + "\nCPF: " + leonardo.CPF
                + "\nMédia: " + leonardo.calcularMedia()
                + "\nstatus: " + leonardo.obterStatus());

    }

    public void executarAlunocominteracao() {
        // instanciar um objeto do aluno
        var aluno1 = new Aluno();
        aluno1.nome = JOptionPane.showInputDialog("Digite o nome");
        aluno1.CPF = JOptionPane.showInputDialog("Digite o cpf");
        aluno1.nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1"));
        aluno1.nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2"));
        aluno1.nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 3"));
        var mediaThiago = aluno1.calcularMedia();
        var statusThiago = aluno1.obterStatus();

        var aluno2 = new Aluno();
        aluno2.nome = JOptionPane.showInputDialog("Digite o nome");
        aluno2.CPF = JOptionPane.showInputDialog("Digite o cpf");
        aluno2.nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1"));
        aluno2.nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2"));
        aluno2.nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 3"));

        JOptionPane.showMessageDialog(
                null,
                "Aluno 1: " + aluno1.nome
                + "\nCPF: " + aluno1.CPF
                + "\nMédia: " + mediaThiago
                + "\nStatus: " + statusThiago
                + "\n\nAluno 2: " + aluno2.nome
                + "\nCPF: " + aluno2.CPF
                + "\nMédia: " + aluno2.calcularMedia()
                + "\nstatus: " + aluno2.obterStatus());

    }

    public static void main(String[] args) {
        new ExemploObjeto().exemploPaciente();
    }

    public void exemploPaciente() {
        // instanciar um objeto do aluno
        var paciente = new Paciente();
        paciente.nome = JOptionPane.showInputDialog("Digite o nome do paciente: ");
        paciente.sobrenome = JOptionPane.showInputDialog("Digite o sobrenome do paciente: ");
        paciente.idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do paciente: "));
        paciente.peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do paciente: "));
        paciente.altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do paciente: "));

        JOptionPane.showMessageDialog(
                null,
                "Nome: " + paciente.calcularNomeCompleto()
                + "\nIdade: " + paciente.idade
                + "\nPeso: " + paciente.peso
                + "\nAltura: " + paciente.altura
                + "\nIMC: " + paciente.verificarImc()
        );

    }
}
 
    
    



/*
exercício 01
criar uma classe de paciente com os seguintes atributos
- nome
- sobrenome
- idade
- peso
- altura
criar os seguintes métodos:
- obterNomecompleto que retorna uma string nome e sobrenome concatenados
- calcular imc que retorna o imc
- obter status imc que retorna o grau do imc (procurar tabela imc)

exercicio 02
*/
