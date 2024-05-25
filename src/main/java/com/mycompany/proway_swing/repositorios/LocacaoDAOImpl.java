package com.mycompany.proway_swing.repositorios;

import com.mycompany.proway_swing.entidades.Locacao;
import jakarta.persistence.EntityManager;

import java.util.List;

public class LocacaoDAOImpl implements LocacaoDAO{

private EntityManager entityManager;

public LocacaoDAOImpl(EntityManager entityManager){

    this.entityManager = entityManager;
}

    @Override
    public void salvar(Locacao locacao) {
    var transaction = entityManager.getTransaction();
    try {
        transaction.begin();

        entityManager.persist(locacao);

    transaction.commit();

    }catch (RuntimeException e){

        if (transaction.isActive()){

            transaction.rollback();
        }
        throw e;
      }
    }

    @Override
    public void atualizar(Locacao locacao) {
    var transaction = entityManager.getTransaction();
    try {
        transaction.begin();
        entityManager.merge(locacao);
        transaction.commit();
    } catch (RuntimeException e) {
        if (transaction.isActive())
            transaction.rollback();
        throw e;
    }
    }

    @Override
    public Locacao obterPorId(Long id) {
    return entityManager.find(Locacao.class, id);

    }

    @Override
    public List<Locacao> obterTodos() {
        return entityManager.createQuery("from clientes", Locacao.class).getResultList();
    }

    @Override
    public void apagar(Long id) {
    var transaction = entityManager.getTransaction();
    try {
        transaction.begin();
        var cliente = entityManager.find(Locacao.class, id);
        if (cliente != null)

            entityManager.remove(cliente);
        transaction.commit();
    }catch (RuntimeException e){
        if (transaction.isActive())
            transaction.rollback();
        throw e;
    }

    }
}
