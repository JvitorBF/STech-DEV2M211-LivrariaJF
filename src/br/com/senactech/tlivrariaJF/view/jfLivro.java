/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senactech.tlivrariaJF.view;

import br.com.senactech.TLivrariaJF.services.EditoraServicos;
import br.com.senactech.TLivrariaJF.services.LivroServicos;
import br.com.senactech.TLivrariaJF.services.ServicosFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import br.com.senactech.tlivrariaJF.model.Livro;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jairb
 */
public final class jfLivro extends javax.swing.JFrame {

    /**
     * Creates new form jfLivro
     */
    public jfLivro() throws SQLException {
        initComponents();
        addRowToTable();
        this.addEditoraJCB();
    }

    public void addEditoraJCB() throws SQLException {
        EditoraServicos editoraS = ServicosFactory.getEditoraServicos();
        jcbEditora.addItem("Selecione...");
        editoraS.buscarEditora().forEach(listEdt -> {
            jcbEditora.addItem(listEdt.getNmEditora());
        });
    }

    public void addRowToTable() throws SQLException {
        DefaultTableModel model = (DefaultTableModel) jtLivros.getModel();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        Object rowData[] = new Object[8];//define vetor das colunas
        LivroServicos livroS = ServicosFactory.getLivroServicos();
        EditoraServicos editoraS = ServicosFactory.getEditoraServicos();
        for (Livro listLiv : livroS.buscarLivro()) {
            rowData[0] = listLiv.getIdLivro();
            rowData[1] = listLiv.getTitulo();
            rowData[2] = listLiv.getAssunto();
            rowData[3] = listLiv.getAutor();
            rowData[4] = listLiv.getIsbn();
            rowData[5] = listLiv.getEstoque();
            rowData[6] = listLiv.getPreco();
            rowData[7] = editoraS.getNomeEdt(listLiv.getIdEditora());
            model.addRow(rowData);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jcbEditora = new javax.swing.JComboBox<>();
        jbSalvar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jlEditora = new javax.swing.JLabel();
        jtfTitulo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtLivros = new javax.swing.JTable();
        jtfAssunto = new javax.swing.JTextField();
        jtfAutor = new javax.swing.JTextField();
        jtfISBN = new javax.swing.JTextField();
        jtfEstoque = new javax.swing.JTextField();
        jtfPreco = new javax.swing.JTextField();
        jbLimpar = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbConfirmar = new javax.swing.JButton();
        jbDeletar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cadastro de Livro");

        jLabel1.setText("Titulo Livro");

        jLabel3.setText("Assunto");

        jLabel4.setText("Autor");

        jLabel5.setText("ISBN");

        jLabel6.setText("Estoque");

        jLabel7.setText("Preço");

        jlEditora.setText("Editora");

        jtfTitulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfTituloKeyTyped(evt);
            }
        });

        jtLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Titulo", "Assunto", "Autor", "ISBN", "Estoque", "Preço", "Editora"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtLivros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtLivrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtLivros);

        jtfAssunto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfAssuntoKeyTyped(evt);
            }
        });

        jtfAutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfAutorKeyTyped(evt);
            }
        });

        jtfISBN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfISBNFocusLost(evt);
            }
        });
        jtfISBN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfISBNKeyTyped(evt);
            }
        });

        jtfEstoque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfEstoqueKeyTyped(evt);
            }
        });

        jtfPreco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfPrecoKeyTyped(evt);
            }
        });

        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        jbSair.setText("Sair");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });

        jbEditar.setText("Editar");
        jbEditar.setEnabled(false);
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jbConfirmar.setText("Confirmar");
        jbConfirmar.setEnabled(false);
        jbConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarActionPerformed(evt);
            }
        });

        jbDeletar.setText("Deletar");
        jbDeletar.setEnabled(false);
        jbDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfAssunto))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jtfEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jtfISBN))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jlEditora)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jcbEditora, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jtfAutor)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbConfirmar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbDeletar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbSair, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jbSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbLimpar)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jtfAssunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlEditora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtfEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jtfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvar)
                    .addComponent(jbLimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbEditar)
                    .addComponent(jbConfirmar)
                    .addComponent(jbDeletar)
                    .addComponent(jbSair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        // TODO add your handling code here:
        jfLivro.this.dispose();
    }//GEN-LAST:event_jbSairActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        // TODO add your handling code here:        
        if (validaImputs()) {
            try {
                LivroServicos livroS = ServicosFactory.getLivroServicos();
                EditoraServicos editoraS = ServicosFactory.getEditoraServicos();
                Livro l = new Livro();

                l.setTitulo(jtfTitulo.getText());
                l.setAssunto(jtfAssunto.getText());
                l.setAutor(jtfAutor.getText());
                l.setIsbn(jtfISBN.getText());
                l.setEstoque(Integer.parseInt(jtfEstoque.getText()));
                l.setPreco(Float.parseFloat(jtfPreco.getText()));
                l.setIdEditora(editoraS.getIdEditora(jcbEditora.getSelectedItem().toString()));
                livroS.cadastrarLivro(l);
                jbLimpar.doClick();
                addRowToTable();
                JOptionPane.showMessageDialog(this, "Livro " + l.getTitulo() + " cadastrado com sucesso!");
            } catch (SQLException ex) {
                Logger.getLogger(jfLivro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        jtfTitulo.setText("");
        jtfAssunto.setText("");
        jtfAutor.setText("");
        jtfISBN.setText("");
        jtfPreco.setText("");
        jtfEstoque.setText("");
        jcbEditora.setSelectedIndex(0);
        jtfTitulo.requestFocus();

        jbSalvar.setEnabled(true);
        jbEditar.setEnabled(false);
        jbConfirmar.setEnabled(false);
        jbDeletar.setEnabled(false);
        jtfISBN.setEnabled(true);
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jtfTituloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfTituloKeyTyped
        String caracteres = "0987654321/[]{}=+-_)(*&¨%$#@!<>;:?.,ºª«»";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_jtfTituloKeyTyped

    private void jtfAutorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfAutorKeyTyped
        String caracteres = "0987654321/[]{}=+-_)(*&¨%$#@!<>;:?.,ºª«»";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_jtfAutorKeyTyped

    private void jtfISBNKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfISBNKeyTyped
        String caracteres = "-1234567890";
        if (caracteres.contains(evt.getKeyChar() + "")) {
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_jtfISBNKeyTyped

    private void jtfAssuntoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfAssuntoKeyTyped
        String caracteres = "0987654321/[]{}=+-_)(*&¨%$#@!<>;:?.,ºª«»";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_jtfAssuntoKeyTyped

    private void jtfEstoqueKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfEstoqueKeyTyped
        String caracteres = "1234567890";
        if (caracteres.contains(evt.getKeyChar() + "")) {
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_jtfEstoqueKeyTyped

    private void jtfPrecoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPrecoKeyTyped
        String caracteres = ",1234567890";
        if (caracteres.contains(evt.getKeyChar() + "")) {
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_jtfPrecoKeyTyped

    private void jtfISBNFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfISBNFocusLost

    }//GEN-LAST:event_jtfISBNFocusLost

    private void jtLivrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtLivrosMouseClicked
        jbEditar.setEnabled(true);
        jbDeletar.setEnabled(true);
        jbSalvar.setEnabled(false);
        jbLimpar.setText("Cancelar");
    }//GEN-LAST:event_jtLivrosMouseClicked

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        try {
            jbDeletar.setEnabled(false);
            jbSalvar.setEnabled(false);
            jbEditar.setEnabled(false);
            jtfISBN.setEnabled(false);
            jbConfirmar.setEnabled(true);
            jbLimpar.setText("Cancelar");

            int linha_da_tabela;
            String isbn;
            linha_da_tabela = jtLivros.getSelectedRow();
            isbn = (String) jtLivros.getValueAt(linha_da_tabela, 4);
            LivroServicos livroS = ServicosFactory.getLivroServicos();
            EditoraServicos editoraS = ServicosFactory.getEditoraServicos();
            Livro l = livroS.getByDocISBN(isbn);

            jtfTitulo.setText(l.getTitulo());
            jtfAssunto.setText(l.getAssunto());
            jtfAutor.setText(l.getAutor());
            jtfISBN.setText(l.getIsbn());
            jtfEstoque.setText(Integer.toString(l.getEstoque()));
            jtfPreco.setText(Float.toString(l.getPreco()));
            jcbEditora.setSelectedItem(editoraS.getNomeEdt(l.getIdEditora()));
        } catch (SQLException ex) {
            Logger.getLogger(jfLivro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbConfirmarActionPerformed

    private void jbDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeletarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbDeletarActionPerformed

    private boolean validaImputs() {
        if (jtfTitulo.getText().isBlank()
                || jtfAutor.getText().isBlank()
                || jtfAssunto.getText().isBlank()
                || jtfISBN.getText().isBlank()
                || jtfEstoque.getText().isBlank()
                || jtfPreco.getText().isBlank()) {
            JOptionPane.showMessageDialog(this,
                    "Todos os campos devem ser preenchidos!",
                    ".: Erro :.", JOptionPane.ERROR_MESSAGE);
            jtfTitulo.requestFocus();
            return false;
        }
        return true;
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
            java.util.logging.Logger.getLogger(jfLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new jfLivro().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(jfLivro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbConfirmar;
    private javax.swing.JButton jbDeletar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbSair;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JComboBox<String> jcbEditora;
    private javax.swing.JLabel jlEditora;
    private javax.swing.JTable jtLivros;
    private javax.swing.JTextField jtfAssunto;
    private javax.swing.JTextField jtfAutor;
    private javax.swing.JTextField jtfEstoque;
    private javax.swing.JTextField jtfISBN;
    private javax.swing.JTextField jtfPreco;
    private javax.swing.JTextField jtfTitulo;
    // End of variables declaration//GEN-END:variables
}
