package com.mycompany.proway_swing.repositorios;

import com.mycompany.proway_swing.entidades.Locacao;

import java.util.List;

public interface LocacaoDAO {
    void salvar(Locacao locacao);

    void atualizar(Locacao locacao);

    Locacao obterPorId(Long id);

    List<Locacao> obterTodos();

    void apagar(Long id);

}
