/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proway_swing.telas;

import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aluno
 */
    public class FilmeJFrame extends javax.swing.JFrame {
    
    private int idEscolhido = -1;

    /**
     * Creates new form FilmeJFrame
     */
    public FilmeJFrame() {
        initComponents();
        listarFilmes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelLista = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFilmes = new javax.swing.JTable();
        jButtonEditarLista = new javax.swing.JButton();
        jButtonApagarLista = new javax.swing.JButton();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jButtomCadastrarNome = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelLista.setText("Lista de Filmes");

        jTableFilmes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableFilmes);
        if (jTableFilmes.getColumnModel().getColumnCount() > 0) {
            jTableFilmes.getColumnModel().getColumn(1).setResizable(false);
        }

        jButtonEditarLista.setText("Editar");
        jButtonEditarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarListaActionPerformed(evt);
            }
        });

        jButtonApagarLista.setText("Apagar");
        jButtonApagarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApagarListaActionPerformed(evt);
            }
        });

        jLabelNome.setText("Nome");

        jButtomCadastrarNome.setText("Cadastrar");
        jButtomCadastrarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtomCadastrarNomeActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelLista))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonEditarLista)
                            .addComponent(jButtonApagarLista))))
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtomCadastrarNome))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelNome)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))))
                .addGap(9, 9, 9))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLista)
                    .addComponent(jLabelNome))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonEditarLista)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonApagarLista)
                            .addComponent(jButtomCadastrarNome)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtomCadastrarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtomCadastrarNomeActionPerformed
        try {
            String nome = jTextFieldNome.getText();

            var jdbcUrl = "jdbc:mysql://localhost:3306/locadora";
            var jdbcUsuario = "root";
            var jdbcSenha = "admin";

            var conexao = DriverManager.getConnection(
                    jdbcUrl, jdbcUsuario, jdbcSenha
            );
            String query;
            if (idEscolhido == -1){
            query = "INSERT INTO filmes (nome) VALUES ('" + nome + "')";
            }else{
                query = "UPDATE filmes SET nome = '" + nome +
                        "' WHERE id = " + idEscolhido;
                idEscolhido = -1; // Retornar para o modo de cadatro
            }
            var statement = conexao.createStatement();
            statement.execute(query);
            
            listarFilmes();

            JOptionPane.showMessageDialog(null, nome);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtomCadastrarNomeActionPerformed

    private void jButtonApagarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApagarListaActionPerformed
            try {
            var jdbcUrl = "jdbc:mysql://localhost:3306/locadora";
            var jdbcUsuario = "root";
            var jdbcSenha = "admin";

            var conexao = DriverManager.getConnection(
                    jdbcUrl, jdbcUsuario, jdbcSenha
            );
            var indiceLinhaSelecionada = jTableFilmes.getSelectedRow();
            var idEscolhidoParaApagar = Integer.parseInt(jTableFilmes
                    .getValueAt(indiceLinhaSelecionada, 0).toString());
            var query = "DELETE FROM filmes WHERE id = '" + idEscolhidoParaApagar + "'";
            var statement = conexao.createStatement();
            statement.execute(query);
            
            listarFilmes();

            JOptionPane.showMessageDialog(null, ("Filme apagado com sucesso"));
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonApagarListaActionPerformed

    private void jButtonEditarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarListaActionPerformed
    var indiceLinhaSelecionada = jTableFilmes.getSelectedRow();
    idEscolhido = Integer.parseInt(jTableFilmes
            .getValueAt(indiceLinhaSelecionada, 0).toString());
    var nomeEscolhido = jTableFilmes.getValueAt(indiceLinhaSelecionada, 1). toString();
    jTextFieldNome.setText(nomeEscolhido);
    
    /**
    * Exercício: Criar uma tabela chamada categorias com as seguintes colunas
    * id: gerada automáticamente, chave primária
    * nome: texto obrigatório
    * Criar um sistema (CRUD) assim como o FilmeJFFrame
    */
// TODO add your handling code here:
    }//GEN-LAST:event_jButtonEditarListaActionPerformed

    private void listarFilmes() {
        try {
            var jdbcUrl = "jdbc:mysql://localhost:3306/locadora";
            var jdbcUsuario = "root";
            var jdbcSenha = "admin";
            var conexao = DriverManager.getConnection(
                    jdbcUrl, jdbcUsuario, jdbcSenha);
            var query = "SELECT id, nome FROM filmes";
            var statement = conexao.createStatement();
            var dados = statement.executeQuery(query); //Tipo resultset
            var modeloTabela = (DefaultTableModel) jTableFilmes.getModel();
            // remover todos os elementos do jTable
            modeloTabela.setRowCount (0);
            while (dados.next()) {
                var id = Integer.parseInt(dados.getString("id"));
                var nome = dados.getString("nome");
                modeloTabela.addRow(new Object[]{
                    id, nome
                });
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FilmeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FilmeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FilmeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FilmeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FilmeJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtomCadastrarNome;
    private javax.swing.JButton jButtonApagarLista;
    private javax.swing.JButton jButtonEditarLista;
    private javax.swing.JLabel jLabelLista;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableFilmes;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
