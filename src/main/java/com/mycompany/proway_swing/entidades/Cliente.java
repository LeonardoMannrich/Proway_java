package com.mycompany.proway_swing.entidades;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private LocalDate dataNascimento;
    private String cpf;

    @OneToMany(mappedBy = "clientes", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Locacao> locacoes;

    public void adicionarLocacao(Locacao locacao){
        // verificar se a lista de locações m existe
        if (locacoes == null)
            //criar uma instancia de lista
            locacoes = new ArrayList<>();

        // adicionar a locação na lista de locações
        locacoes.add(locacao);
        // Atribuir o cliente para aquela nova locação
        locacao.setCliente(this);

    }

    public void removerLocacao(Locacao locacao){
        // Remover a locaçãp da lista de locações
        locacoes.remove(locacao);
        // Remover a atribuição de cliente com quela locação existente
        locacao.setCliente(null);
    }

    public List<Locacao> getLocacoes() {
        return locacoes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
