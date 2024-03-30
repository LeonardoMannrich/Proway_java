/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proway_swing;

import java.util.ArrayList;
        
public class AlunoEnsinoMedio {
   
   public String nome;
   public String CPF;
   public ArrayList<Double> notas = new ArrayList<>();
   
   //método responsavel por adicionar uma nota na lista
   //de notas, ou seja, é possivel ter quantas notas forem
   //necessáras
    
   public void adicionarNota(double nota){
       notas.add(nota);
   }
   public double calcularMedia(){
     var soma = 0.0;
     //percorrer cada uma das notas cadastradas
     for (int i = 0; i < notas.size(); i++) {
     //obtendo a nota da lista de notas na posição i
     var nota = notas.get(i);
     // Acumular a nota na variavel soma 
     soma = soma + nota;
     }
     // calular a média utilizando a soma das notas 
     // dividindo pela quantidade de  notas cadastradas
     var media = soma / notas.size();
     return media;
   }
   
   public String obterStatus(){
       var media = calcularMedia();
       var status = "";
       
       if (media < 5) {
           status = "Reprovado";
       } else if (media < 7) {
           status = "Em recuperação";
       } else{
           status = "Aprovado";
       }
       return status;
   }
    
}
