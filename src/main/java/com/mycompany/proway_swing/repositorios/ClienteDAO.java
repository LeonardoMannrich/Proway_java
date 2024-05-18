package com.mycompany.proway_swing.repositorios;

import com.mycompany.proway_swing.entidades.Cliente;

import java.util.List;

public interface ClienteDAO {
    void salvar(Cliente cliente);

    void atualizar(Cliente cliente);

    Cliente obterPorId(Long Id);

    List<Cliente> obtertodos();

    void apagar(Long id);
}
