/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proway_swing.entidades;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author 74703
 */
public class Filme {

    private int id;
    private Categoria categoria;
    private String nome;
    private LocalDate dataPublicacao;
    private String descricao;
    private double orcamento;
    private double bilheteria;
    private String diretor;
    private LocalTime duracao;
    private byte classificacao;
    

    // Definir o valor para o atributo id do filme
    public void setId(int idFilme) {
        id = idFilme;
    }

    // obter o valor do atributo id do filme
    public int getId() {
        return id;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    

    public void setNome(String nomeFilme) {
        nome = nomeFilme;
    }

    public String getNome() {
        return nome;
    }
    public void setDataPublicacao(LocalDate dataPublicacaoFilme){
        dataPublicacao = dataPublicacaoFilme;
    }
    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }
    public void setDescricao(String descricaoFilme) {
        descricao = descricaoFilme;
    }
     public String getDescricao() {
        return descricao;
    }
      public void setOrcamento(double orcamentoFilme) {
        orcamento = orcamentoFilme;
    }
    public double getOrcamento() {
        return orcamento;
    }
        public void setBilheteria(double bilheteriaFilme) {
        bilheteria = bilheteriaFilme;
    }
        public double getBilheteria() {
        return bilheteria;
    }
        public void setDiretor(String diretorFilme) {
        diretor = diretorFilme;
    }
        public String getDiretor() {
        return diretor;
    }
        public void setDuracao(LocalTime duracaoFilme) {
        duracao = duracaoFilme;
    }
        public LocalTime getDuracao() {
        return duracao;
    }
        public void setClassificacao(Byte classificacaoFilme) {
        classificacao = classificacaoFilme;
    }
        public byte getClassificacao() {
        return classificacao;
}
        
}
