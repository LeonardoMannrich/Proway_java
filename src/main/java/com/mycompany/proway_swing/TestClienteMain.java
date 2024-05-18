package com.mycompany.proway_swing;

import com.mycompany.proway_swing.bancoDados.HibernateUtil;
import com.mycompany.proway_swing.entidades.Cliente;
import com.mycompany.proway_swing.repositorios.ClienteDAO;
import com.mycompany.proway_swing.repositorios.ClienteDAOImpl;

import java.time.LocalDate;

public class TestClienteMain {
    public static void main(String[] args) {
        var entityManager = HibernateUtil.getEntityManager();
        ClienteDAO clienteDAO = new ClienteDAOImpl(entityManager);

  //      var cliente = new Cliente();
  //      cliente.setNome("Jacinto da Costa");
  //      cliente.setCpf("023.293.293-01");
  //      cliente.setDataNascimento(LocalDate.of(1989, 3, 23));

  //      clienteDAO.salvar(cliente);

        //SELECT

        var cliente = clienteDAO.obterPorId(1L);
        System.out.println(cliente.getNome());

         var clienteGiovana = new Cliente();
         clienteGiovana.setNome("Giovanna Antônia pereira");
         clienteGiovana.setCpf("966.909.137-32");
         clienteGiovana.setDataNascimento(LocalDate.of(1948, 2, 13));
         //   clienteDAO.salvar(clienteGiovana);

            var clientes = clienteDAO.obtertodos();
            for (var clienteIterado : clientes) {
                System.out.println(cliente.getId() + "=>" + clienteIterado.getNome());
            }
    }
}
