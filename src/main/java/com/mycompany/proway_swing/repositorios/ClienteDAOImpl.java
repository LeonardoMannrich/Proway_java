package com.mycompany.proway_swing.repositorios;

import com.mycompany.proway_swing.entidades.Cliente;
import jakarta.persistence.EntityManager;

import java.util.List;

public class ClienteDAOImpl implements ClienteDAO {

    private EntityManager entityManager;

    //construtor: construir o objeto com os dados necessários
    //public Nomeclasse(parametros*){
    public ClienteDAOImpl(EntityManager entityManager){
        //armazenando o parâmetro entityMenager no atributo entityManager da classe, utilizando o this para
        //acessar o entityManager externo do construtor
        this.entityManager = entityManager;
    }

    @Override
    public void salvar(Cliente cliente) {
        // Criando uma transação com o banco de dados
        var transaction = entityManager.getTransaction();
        try {
            // iniciando a transação
            transaction.begin();
            entityManager.persist(cliente);
            //gerar o insert into e persistir o cliente na tabela de clientes
            transaction.commit();
        }catch (RuntimeException e){
            //caso de algum erro, verificar se a transação está ativa
            if (transaction.isActive()){
                //Efetuar o desfazer da transação
                transaction.rollback();
            }
            //Relançar o erro para depois ser tratado
            throw e;
        }

    }

    @Override
    public void atualizar(Cliente cliente) {
    var transaction = entityManager.getTransaction();
    try{
        transaction.begin();
        entityManager.merge(cliente);
        transaction.commit();
    } catch (RuntimeException e) {
        if (transaction.isActive())
            transaction.rollback();
         throw e;
    }
    }

    @Override
    public Cliente obterPorId(Long Id) {
    // SELECT * FROM clientes WHERE id = id;
    return entityManager.find(Cliente.class, Id);

    }

    @Override
    public List<Cliente> obtertodos() {
        //SELECT * FROM clientes;
        return entityManager.createQuery("from clientes", Cliente.class).getResultList();
    }

    @Override
    public void apagar(Long id) {
        var transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            var cliente = entityManager.find(Cliente.class, id);
            if (cliente != null)
                //Executando o DELETE FROM clientes WHERE id = id;
                entityManager.remove(cliente);
            transaction.commit();
        }catch (RuntimeException e){
            if (transaction.isActive())
                transaction.rollback();
            throw e;
        }

    }
}
