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
public class ExercicioArrayListAlunoInterativo {
    
    private ArrayList<Aluno> Aluno = new ArrayList<>();
    private int idAluno = 1;
    
    
    public void apresentarMenu() {
        
        var botoes = new String[]
        {"cadastrar", "Editar", "Apagar", "Listar todos", "Produto menor preço", "Calcular total", "Sair"};
        
        var menuEscolhido = 0;
        var botaoSairAluno = botoes.length -1;
        while (menuEscolhido != botaoSairAluno && menuEscolhido != JOptionPane.CLOSED_OPTION) {
            menuEscolhido = JOptionPane.showOptionDialog(
            null,
            "Escolha o menu desejado",
             "Sistema Proway",
             JOptionPane.DEFAULT_OPTION,
             JOptionPane.INFORMATION_MESSAGE,
             null,
             botoes,
             "Cadastrar");
           /* switch (menuEscolhido) {
                case 0:
                    CadastrarAluno();
                    
                case 0:
                    CadastrarAluno();
                    break;
                case 0:
                    CadastrarAluno();
                break;
                    
            }*/
             
        }
        }
}
         
        

