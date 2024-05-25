package com.mycompany.proway_swing.repositorios;

import com.mycompany.proway_swing.entidades.Categoria;
import jakarta.persistence.EntityManager;

import java.util.List;

public class CategoriaDAOImpl implements CategoriaDAO {
    private EntityManager entityManager;

    //construtor: construir o objeto com os dados necessários
    //public Nomeclasse(parametros*){
    public CategoriaDAOImpl(EntityManager entityManager){
        //armazenando o parâmetro entityMenager no atributo entityManager da classe, utilizando o this para
        //acessar o entityManager externo do construtor
        this.entityManager = entityManager;
    }

    @Override
    public void salvar(Categoria categoria) {
        // Criando uma transação com o banco de dados
        var transaction = entityManager.getTransaction();
        try {
            // iniciando a transação
            transaction.begin();
            entityManager.persist(categoria);
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
    public void atualizar(Categoria categoria) {
        var transaction = entityManager.getTransaction();
        try{
            transaction.begin();
            entityManager.merge(categoria);
            transaction.commit();
        } catch (RuntimeException e) {
            if (transaction.isActive())
                transaction.rollback();
            throw e;
        }
    }

    @Override
    public Categoria obterPorId(Long Id) {
        // SELECT * FROM clientes WHERE id = id;
        return entityManager.find(Categoria.class, Id);

    }

    @Override
    public List<Categoria> obterTodos() {
        //SELECT * FROM clientes;
        return entityManager.createQuery("from categorias", Categoria.class).getResultList();
    }

    @Override
    public void apagar(Long id) {
        var transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            var categoria = entityManager.find(Categoria.class, id);
            if (categoria != null)
                //Executando o DELETE FROM clientes WHERE id = id;
                entityManager.remove(categoria);
            transaction.commit();
        }catch (RuntimeException e){
            if (transaction.isActive())
                transaction.rollback();
            throw e;
        }

    }
}


