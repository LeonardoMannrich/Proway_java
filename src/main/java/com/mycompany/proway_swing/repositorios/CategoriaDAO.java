package com.mycompany.proway_swing.repositorios;

import com.mycompany.proway_swing.entidades.Categoria;
import com.mycompany.proway_swing.entidades.Locacao;

import java.util.List;

public interface CategoriaDAO {

    void salvar(Categoria categoria);

    void atualizar(Categoria categoria);

    Categoria obterPorId(Long id);

    List<Categoria> obterTodos();

    void apagar(Long id);

}
