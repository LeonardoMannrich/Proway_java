package com.mycompany.proway_swing;

import com.mycompany.proway_swing.bancoDados.HibernateUtil;
import com.mycompany.proway_swing.entidades.Cliente;
import com.mycompany.proway_swing.repositorios.ClienteDAO;
import com.mycompany.proway_swing.repositorios.ClienteDAOImpl;
import jakarta.persistence.EntityManager;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Clientejframe extends JFrame {
    private JTextField textFieldNome;
    private JFormattedTextField formattedTextFieldCPF;
    private JFormattedTextField formattedTextFieldDatadenascimento;
    private JPanel painel;
    private JButton buttonSalvar;
    private JTable table1;
    private EntityManager entityManager;
    private ClienteDAO clienteDAO;

    public Clientejframe() {
        entityManager = HibernateUtil.getEntityManager();
        clienteDAO = new ClienteDAOImpl(entityManager);
        listarClientes();

        buttonSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salvarcliente();
            }
        });
    }

    private void salvarcliente() {
        var nome = textFieldNome.getText().trim();
        var cpf = formattedTextFieldCPF.getText().trim();
        var dataNascimento = formattedTextFieldDatadenascimento.getText().trim();

        var cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setCpf(cpf);
        cliente.setDataNascimento(LocalDate.parse(dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        clienteDAO.salvar(cliente);
        listarClientes();
        textFieldNome.setText("");
        formattedTextFieldCPF.setText("");
        formattedTextFieldDatadenascimento.setText("");
    }

    private void listarClientes() {
        var clientes = clienteDAO.obtertodos();
        table1.setModel(new ClienteTableModel(clientes));

    }

    public static void main(String[] args) {
        var jFrame = new Clientejframe();
        jFrame.setContentPane(jFrame.painel);
        jFrame.setSize(600, 400);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    private class ClienteTableModel extends AbstractTableModel {

        private final String[] COLUMNS = {"código", "Nome", "CPF", "Data de Nascimento"};
        private List<Cliente> clientes;

        private ClienteTableModel(List<Cliente> clientes) {
            this.clientes = clientes;
        }

        @Override
        public int getRowCount() {
            return clientes.size();
        }

        @Override
        public int getColumnCount() {
            return COLUMNS.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            var cliente = clientes.get(rowIndex);
            return switch (columnIndex) {
                case 0 -> cliente.getId();
                case 1 -> cliente.getNome();
                case 2 -> cliente.getCpf();
                case 3 -> cliente.getDataNascimento();
                default -> "";
            };
        }
    }
}
