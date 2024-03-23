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
public class ExemploVetores {

    public static void main(String[] args) {

        // exemplo01(); 
        exemplo05();

    }

    private static void exemplo01() {
        //        String nome1 = "Batman";
        //        String nome2 = "Robin";
        //        String nome3 = "Mulher Maravilha";
        // Vetor é uma forma de armazenar várias variaveis, cada uma em uma posição diferente
        String[] nomes = new String[3]; // Criando um vetor com 3 posições
        nomes[0] = "Batman"; // Armazenando na primeira posição "Batman"
        nomes[1] = "Robin";
        nomes[2] = "Mulher maravilha";

        nomes[2] = "Wonder Woman"; // Atualizando a terceira posição de "Mulher maravilha" para "Wonder Woman"

        // Apresentar o que está armazenado no vetor
        System.out.println("1º nome: " + nomes[0]);
        System.out.println("2º nome: " + nomes[1]);
        System.out.println("3º nome: " + nomes[2]);
    }

    private static void exemplo02() {
        int[] numeros = new int[5];
        numeros[0] = Integer.parseInt(JOptionPane.showInputDialog(null, "digite o 1 numero"));
        numeros[1] = Integer.parseInt(JOptionPane.showInputDialog(null, "digite o 2 numero"));
        numeros[2] = Integer.parseInt(JOptionPane.showInputDialog(null, "digite o 3 numero"));
        numeros[3] = Integer.parseInt(JOptionPane.showInputDialog(null, "digite o 4 numero"));
        numeros[4] = Integer.parseInt(JOptionPane.showInputDialog(null, "digite o 5 numero"));

        int soma = numeros[0] + numeros[1] + numeros[2] + numeros[3] + numeros[4];

        JOptionPane.showMessageDialog(
                null,
                "Número 01: " + numeros[1]
                + "Número 02: " + numeros[2]
                + "Número 03: " + numeros[3]
                + "Número 04: " + numeros[4]
                + "Número 05: " + numeros[5]
        );
    }

    public static void exemplo04() {

        String[] Nome = new String[4];
        int[] idade = new int[4];
        Nome[0] = (JOptionPane.showInputDialog(null, "digite o 1 nome"));
        idade[0] = Integer.parseInt(JOptionPane.showInputDialog(null, "digite a idade do 1 nome "));
        Nome[1] = (JOptionPane.showInputDialog(null, "digite o 2 nome"));
        idade[1] = Integer.parseInt(JOptionPane.showInputDialog(null, "digite a idade do 2 nome "));
        Nome[2] = (JOptionPane.showInputDialog(null, "digite o 3 nome"));
        idade[2] = Integer.parseInt(JOptionPane.showInputDialog(null, "digite a idade do 3 nome "));
        Nome[3] = (JOptionPane.showInputDialog(null, "digite o 4 nome"));
        idade[3] = Integer.parseInt(JOptionPane.showInputDialog(null, "digite a idade do 4 nome "));

        JOptionPane.showMessageDialog(
                null,
                "Nome 01: " + Nome[0] + "  E sua idade: " + idade[0] + "\n"
                + "Nome 02:  " + Nome[1] + "  E sua idade: " + idade[1] + "\n"
                + "Nome 03: " + Nome[2] + "  E sua idade: " + idade[2] + "\n"
                + "Nome 04: " + Nome[3] + "  E sua idade: " + idade[3] + "\n"
        );
        int soma = idade[0] + idade[1] + idade[2] + idade[3];
        double resultado = soma / 4.0;
        JOptionPane.showMessageDialog(null, "A média das idades é: " + resultado);
    }

    public static void exemplo05() {

        int[] idade = new int[5];
        String[] nome = new String[5];

        for (int i = 0; i < 5; i = i + 1) {
            nome[i] = JOptionPane.showInputDialog("Digite o nome da " + (i + 1) + " pessoa");
            idade[i] = Integer.parseInt(JOptionPane.showInputDialog("digite a " + (i + 1) + " idade"));

        }

        int sum = 0;
        for (int i = 0; i < 5; i = i + 1) {
            sum = sum + idade[i];
        }

        String text = "";
        for (int i = 0; i < 5; i = i + 1) {
            text = text + "idade " + (i + 1) + ":" + idade[i] + "    " + "Nomes " + (i + 1) + ":" + nome [i] + "\n";
        }
        text = text + "soma: " + sum;

        JOptionPane.showMessageDialog(null, "soma:\n" + text);
        JOptionPane.showMessageDialog(null, "Divisão:\n" + sum / 5);

    }

    private static void exemplo03() {
        int[] numeros = new int[5];
        for (int i = 0; i < 5; i = i + 1) {
            numeros[1] = Integer.parseInt(JOptionPane.showInputDialog("digite o" + numeros));
        }

        int soma = 0;
        for (int i = 0; i < 5; i = i + 1) {
            soma = soma + numeros[i];
        }

        String texto = "";
        for (int i = 0; i < 5; i = i + 1) {
            texto = texto + "numero: " + numeros[1] + "\n";
        }
        texto = texto + "soma: " + soma;

        JOptionPane.showMessageDialog(null, "soma: " + texto);

    }
}
