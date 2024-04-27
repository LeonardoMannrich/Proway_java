/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proway_swing.telas;

import com.mycompany.proway_swing.repositorios.CategoriaRepositorio;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CategoriaJFrame extends javax.swing.JFrame {

    private int idEscolhido = -1;

    public CategoriaJFrame() {
        initComponents();
        listarCategorias();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jButtonCadastrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCategorias = new javax.swing.JTable();
        jLabelListaCategorias = new javax.swing.JLabel();
        jButtonEditar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonApagar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelNome.setText("Nome");

        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jTableCategorias.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Código", "Nome"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableCategorias);
        if (jTableCategorias.getColumnModel().getColumnCount() > 0) {
            jTableCategorias.getColumnModel().getColumn(0).setResizable(false);
            jTableCategorias.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabelListaCategorias.setText("Lista de Categorias");

        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jButtonApagar.setText("Apagar");
        jButtonApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane1)
                                        .addComponent(jLabelListaCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonEditar)
                                        .addComponent(jButtonApagar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jButtonCadastrar, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabelNome))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelListaCategorias)
                                        .addComponent(jLabelNome, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButtonEditar))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButtonCadastrar)
                                                        .addComponent(jButtonApagar)))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jSeparator1)
        );

        pack();
    }// </editor-fold>                        

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {

        String nome = jTextFieldNome.getText();

        if (idEscolhido == -1) {
            var repositorio = new CategoriaRepositorio();
            repositorio.inserir(nome);
        } else {
            var repositorio = new CategoriaRepositorio();
            repositorio.alterar(idEscolhido, nome);
            idEscolhido = -1; // Retornar para o modo de cadastro
        }

        listarCategorias();

        JOptionPane.showMessageDialog(
                null, "Categoria cadastrada com sucesso");

    }

    private void jButtonApagarActionPerformed(java.awt.event.ActionEvent evt) {

        var indiceLinhaSelecionada = jTableCategorias.getSelectedRow();
        var idEscolhidoParaApagar = Integer.parseInt(jTableCategorias
                .getValueAt(indiceLinhaSelecionada, 0).toString());

        var categoriaRepositorio = new CategoriaRepositorio();
        categoriaRepositorio.apagar(idEscolhidoParaApagar);

        listarCategorias();

        JOptionPane.showMessageDialog(null, "Filme apagado com sucesso");

    }

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {
        var indiceLinhaSelecionada = jTableCategorias.getSelectedRow();
        idEscolhido = Integer.parseInt(jTableCategorias
                .getValueAt(indiceLinhaSelecionada, 0).toString());
        var nomeEscolhido = jTableCategorias.getValueAt(indiceLinhaSelecionada, 1).toString();
        jTextFieldNome.setText(nomeEscolhido);
    }

    /**
     * Exercício: Criar uma tabela chamada categorias com as seguintes colunas
     * id: gerada automáticamente, chave primária nome: texto obrigatório Criar
     * um sistema (CRUD) assim como o FilmeJFrame
     */
    private void listarCategorias() {
        var modeloTabela = (DefaultTableModel) jTableCategorias.getModel();
        // remover todos os elelmentos jtable
        modeloTabela.setRowCount(0);
        var categoriaRepositorio = new CategoriaRepositorio();
        var categorias = categoriaRepositorio.obterTodos();
        for (var i = 0; i < categorias.size(); i++) {
            var categoria = categorias.get(i);
            modeloTabela.addRow(new Object[]{categoria.id,categoria.nome

            });
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
            java.util.logging.Logger.getLogger(CategoriaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CategoriaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CategoriaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CategoriaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CategoriaJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButtonApagar;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JLabel jLabelListaCategorias;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableCategorias;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration                   
}
//mudar de statement para prepare statement
