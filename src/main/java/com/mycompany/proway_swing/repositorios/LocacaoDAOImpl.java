package com.mycompany.proway_swing.repositorios;

import com.mycompany.proway_swing.entidades.Locacao;

import java.util.List;

public class LocacaoDAOImpl {

        void salvar(Locacao locacao);
        
        void atualizar(Locacao locacao);

        Locacao obterPorId(Long id);

        List<Locacao> obterTodos();

        void apagar(Long id);

    }
