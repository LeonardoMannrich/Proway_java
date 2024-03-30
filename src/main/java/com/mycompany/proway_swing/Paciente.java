/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proway_swing;

/**
 *
 * @author 74703
 */
public class Paciente {

    public String nome;
    public String sobrenome;
    public int idade;
    public double peso;
    public double altura;

    public double calcularImc() {
        var somaAltura = (altura * altura);
        var imc = (peso / somaAltura);
        return imc;
    }

    public String verificarImc() {
        var imc = calcularImc();
        var imcStatus = "";
        if (imc < 18.5) {
            imcStatus = "Abaixo do peso";
        } else if (imc >= 18.5 && imc <= 24.9) {
            imcStatus = "Peso Normal";
        } else {
            imcStatus = "Acima do peso";
        }
        return imcStatus;

    }

    public String calcularNomeCompleto() {
        var nomeCompleto = (nome + " " + sobrenome);
        return nomeCompleto;
    }

}
