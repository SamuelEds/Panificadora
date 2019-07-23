package panificadora.view;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import panificadora.model.moduloVendas;

public class TelaVendas extends javax.swing.JFrame {

    public TelaVendas() {
        initComponents();
        preco1.setEnabled(false);
        descProduto.setEnabled(false);
        data.setEnabled(false);
        quantidade.setEnabled(false);
        valor.setEnabled(false);
        cod.setEnabled(false);
        pesquisar.setEnabled(false);
        descProduto.setEnabled(false);
        fecharV.setEnabled(false);
        cancelarV.setEnabled(false);
        pesquisarV.setEnabled(false);
        additem.setEnabled(false);
        codigoCliente.setEnabled(false);
        comprar.setEnabled(false);
        delete.setEnabled(false);
        calcFinal.setEnabled(false);
        quant.setEnabled(false);
    }

    private void Produtos() {

        try {
            StringBuilder b;
            String local = "../Panificadora/Clientes/Cliente" + codigoCliente.getText() + "/produtos.txt";
            FileWriter x = new FileWriter(local, false);
            PrintWriter y = new PrintWriter(x);
            ArrayList<StringBuilder> linhas = new ArrayList<StringBuilder>();
            for (int i = 0; i < tabela.getRowCount(); i++) {
                b = new StringBuilder();
                for (int j = 0; j < tabela.getColumnCount(); j++) {
                    b.append(tabela.getValueAt(i, j)).append(";");
                }
                linhas.add(b);
            }
            for (StringBuilder cb : linhas) {
                y.println(cb.toString());
            }
            x.close();

        } catch (IOException ex) {
            Logger.getLogger(moduloVendas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void lerDados(String cod) {
        try {
            BufferedReader bf = new BufferedReader(new FileReader("../Panificadora/Clientes/Cliente" + cod + "/produtos.txt"));
            DefaultTableModel model = (DefaultTableModel) tabela.getModel();
            String s = bf.readLine();
            while (s != null) {
                String[] ss = s.split(";");
                for (int i = 0; i < ss.length; i++) {
                    if (ss.equals("null")) {
                        ss = null;
                    }
                }
                model.addRow(ss);
                s = bf.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Arquivo não encontrado!");
        } catch (IOException ex) {
            System.out.println("Linhas não foram lidas!");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cancelarV = new javax.swing.JButton();
        abrirV = new javax.swing.JButton();
        fecharV = new javax.swing.JButton();
        pesquisarV = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cod = new javax.swing.JTextField();
        pesquisar = new javax.swing.JButton();
        descProduto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        valor = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        quant = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        preco1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        quantidade = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        data = new javax.swing.JTextField();
        additem = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        codigoCliente = new javax.swing.JTextField();
        comprar = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        calcFinal = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(153, 153, 0));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 3, 36)); // NOI18N
        jLabel1.setText("Módulo de Vendas");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(370, 0, 340, 40);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        cancelarV.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        cancelarV.setText("Cancelar Vendas");
        cancelarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarVActionPerformed(evt);
            }
        });
        jPanel1.add(cancelarV);
        cancelarV.setBounds(480, 10, 180, 40);

        abrirV.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        abrirV.setText("Abrir Vendas");
        abrirV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirVActionPerformed(evt);
            }
        });
        jPanel1.add(abrirV);
        abrirV.setBounds(20, 10, 150, 40);

        fecharV.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        fecharV.setText("Fechar Vendas");
        fecharV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharVActionPerformed(evt);
            }
        });
        jPanel1.add(fecharV);
        fecharV.setBounds(250, 10, 160, 40);

        pesquisarV.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        pesquisarV.setText("Pesquisar Venda");
        pesquisarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarVActionPerformed(evt);
            }
        });
        jPanel1.add(pesquisarV);
        pesquisarV.setBounds(730, 10, 190, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 40, 1000, 60);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel2.setText("Código do Produto:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 10, 180, 40);

        cod.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jPanel2.add(cod);
        cod.setBounds(180, 10, 160, 40);

        pesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panificadora/imagens/lupa.png"))); // NOI18N
        pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarActionPerformed(evt);
            }
        });
        jPanel2.add(pesquisar);
        pesquisar.setBounds(350, 10, 70, 30);

        descProduto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(descProduto);
        descProduto.setBounds(640, 0, 310, 40);

        jLabel4.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel4.setText("Quantidade Disp.");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(430, 50, 200, 50);

        jLabel6.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel6.setText("Valor: R$");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(90, 60, 90, 24);

        valor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(valor);
        valor.setBounds(180, 60, 160, 30);

        jLabel10.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel10.setText("Nome do produto:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(430, 0, 200, 40);

        quant.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(quant);
        quant.setBounds(640, 50, 310, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(50, 110, 960, 100);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Preço Final: R$");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(560, 60, 190, 40);

        preco1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        preco1.setText("0.00");
        preco1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preco1ActionPerformed(evt);
            }
        });
        jPanel3.add(preco1);
        preco1.setBounds(750, 60, 130, 40);

        jLabel5.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel5.setText("Quantidade:");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(10, 20, 140, 33);

        quantidade.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel3.add(quantidade);
        quantidade.setBounds(150, 20, 170, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Data de Val.:");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(10, 70, 130, 22);

        data.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel3.add(data);
        data.setBounds(140, 60, 190, 40);

        additem.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        additem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panificadora/imagens/adicionar.png"))); // NOI18N
        additem.setText("Add Item");
        additem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additemActionPerformed(evt);
            }
        });
        jPanel3.add(additem);
        additem.setBounds(700, 10, 140, 40);

        jLabel8.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel8.setText("Código do Cliente:");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(330, 10, 220, 33);

        codigoCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel3.add(codigoCliente);
        codigoCliente.setBounds(540, 10, 140, 30);

        comprar.setBackground(new java.awt.Color(153, 153, 153));
        comprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panificadora/imagens/cart.png"))); // NOI18N
        comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarActionPerformed(evt);
            }
        });
        jPanel3.add(comprar);
        comprar.setBounds(900, 60, 120, 40);

        delete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panificadora/imagens/delete.png"))); // NOI18N
        delete.setText("Delete Item ");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel3.add(delete);
        delete.setBounds(850, 9, 170, 40);

        calcFinal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        calcFinal.setText("Calcular Total");
        calcFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcFinalActionPerformed(evt);
            }
        });
        jPanel3.add(calcFinal);
        calcFinal.setBounds(350, 60, 190, 40);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(-10, 230, 1040, 110);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(null);

        tabela.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Produto", "Preço R$"
            }
        ));
        jScrollPane1.setViewportView(tabela);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 900, 240);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(60, 350, 900, 240);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panificadora/imagens/arrow_undo.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(3, 0, 110, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panificadora/imagens/fundoAmarelo.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(-10, -100, 2700, 1080);

        setSize(new java.awt.Dimension(1051, 647));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarVActionPerformed
        preco1.setText("0.00");
        descProduto.setText("");
        quantidade.setText("");
        valor.setText("");
        cod.setText("");
        descProduto.setText("");
        codigoCliente.setText("");
        quant.setText("");

        DefaultTableModel table = (DefaultTableModel) tabela.getModel();

        table.setNumRows(0);

    }//GEN-LAST:event_cancelarVActionPerformed

    private void abrirVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirVActionPerformed
        quantidade.setEnabled(true);
        cod.setEnabled(true);
        pesquisar.setEnabled(true);
        fecharV.setEnabled(true);
        cancelarV.setEnabled(true);
        pesquisarV.setEnabled(true);
        additem.setEnabled(true);
        codigoCliente.setEnabled(true);
        comprar.setEnabled(true);
        delete.setEnabled(true);
        calcFinal.setEnabled(true);
    }//GEN-LAST:event_abrirVActionPerformed

    private void fecharVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharVActionPerformed
        new Home().setVisible(true);
        dispose();
    }//GEN-LAST:event_fecharVActionPerformed

    private void pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarActionPerformed
        if (evt.getSource() == pesquisar) {
            try {

                String codigo = cod.getText();

                //Ler o arquivo.
                BufferedReader leitura = new BufferedReader(new FileReader("../Panificadora/Produtos/Produto" + codigo + ".txt"));
                leitura.readLine();
                String preco = leitura.readLine();
                String produto = leitura.readLine();
                String datav = leitura.readLine();
                leitura.readLine();
                leitura.readLine();

                valor.setText(preco);
                descProduto.setText(produto);
                data.setText(datav);
                quant.setText(leitura.readLine());

                //Fechar arquivo
                leitura.close();

            } //Caso o c�digo for incorreto ou n�o existir
            catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "Código Inválido", "Aviso", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_pesquisarActionPerformed

    private void preco1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preco1ActionPerformed
        preco1.setEnabled(false);
    }//GEN-LAST:event_preco1ActionPerformed

    private void pesquisarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarVActionPerformed
        if (evt.getSource() == pesquisarV) {
            String codigo = JOptionPane.showInputDialog("Digite o Código de Cliente: ");
            String codigop = JOptionPane.showInputDialog("Digite o Código do Produto: ");
            try {
                BufferedReader bf = new BufferedReader(new FileReader("../Panificadora/Clientes/Cliente" + codigo + "/Compra" + codigop + ".txt"));

                cod.setText(bf.readLine());
                descProduto.setText(bf.readLine());
                quantidade.setText(bf.readLine());
                valor.setText(bf.readLine());
                preco1.setText(bf.readLine());
                codigoCliente.setText(bf.readLine());
                data.setText(bf.readLine());

                lerDados(codigo);

            } catch (FileNotFoundException ex) {
                Logger.getLogger(TelaVendas.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(TelaVendas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_pesquisarVActionPerformed

    private void additemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_additemActionPerformed
        try {

            double q = Double.valueOf(quantidade.getText());
            double v = Double.valueOf(valor.getText());
            double c = q * v;

            //Inserir Valores na Tabela
            DefaultTableModel table = (DefaultTableModel) tabela.getModel();
            Object[] dados = {cod.getText(), descProduto.getText(), String.valueOf(c)};
            table.addRow(dados);

        } catch (java.lang.NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Itens não adicionados/Código Inválido", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_additemActionPerformed

    private void comprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarActionPerformed
        moduloVendas mv = new moduloVendas();

        double v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a pagar: "));
        double v2 = Double.parseDouble(preco1.getText());
        int q1 = Integer.parseInt(quantidade.getText());
        int q2 = Integer.parseInt(quant.getText());
        double troco = v1 - v2;
        if (codigoCliente.getText().equals("") || cod.getText().equals("") || quantidade.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Alguns campos não foram preenchidos", "Aviso", JOptionPane.ERROR_MESSAGE);
        } else if(mv.VerificarQuantidade(cod.getText()) && q1 < q2){

            if (troco >= 0 && !preco1.getText().equals("0.00")) {
                mv.setCodigoCliente(codigoCliente.getText());
                mv.setCodigo_do_Produto(cod.getText());
                mv.setData_de_Compra(data.getText());
                mv.setNome_Do_Produto(descProduto.getText());
                mv.setPreco_final(preco1.getText());
                mv.setQuantidade(quantidade.getText());
                mv.setCodigoCliente(codigoCliente.getText());
                mv.setValor_Produto(valor.getText());
                JOptionPane.showMessageDialog(null, "Troco: " + troco);

                JOptionPane.showMessageDialog(null, mv.SalvarCompra());
                Produtos();

                preco1.setText("0.00");
                descProduto.setText("");
                quantidade.setText("");
                valor.setText("");
                cod.setText("");
                descProduto.setText("");
                codigoCliente.setText("");
                DefaultTableModel table = (DefaultTableModel) tabela.getModel();

                table.setNumRows(0);

            } else if (troco < 0 || codigoCliente.getText().equals("") || cod.getText().equals("") || quantidade.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Saldo Insuficiente/Quantidade Indisponível, compra não efetuada", "Aviso", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Por Favor: Insira o preço para fazer o cálculo.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }//GEN-LAST:event_comprarActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed

//        Se alguma linha for selecionada, acontece a exclus�o.
        if (tabela.getSelectedRow() != -1) {

            DefaultTableModel table = (DefaultTableModel) tabela.getModel();

            double soma = Double.valueOf(preco1.getText());

            double valorAux = Double.parseDouble(tabela.getValueAt(tabela.getSelectedRow(), 2).toString());
            soma -= valorAux;
            table.removeRow(tabela.getSelectedRow());
            preco1.setText(String.valueOf(soma));
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha para excluir!!", "Aviso", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_deleteActionPerformed

    private void calcFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcFinalActionPerformed
        double soma = 0;
        for (int i = 0; i < tabela.getRowCount(); i++) {
            double valorAux = Double.parseDouble(tabela.getValueAt(i, 2).toString());
            soma += valorAux;
        }
        preco1.setText(String.valueOf(soma));
    }//GEN-LAST:event_calcFinalActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Home().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abrirV;
    private javax.swing.JButton additem;
    private javax.swing.JButton calcFinal;
    private javax.swing.JButton cancelarV;
    private javax.swing.JTextField cod;
    private javax.swing.JTextField codigoCliente;
    private javax.swing.JButton comprar;
    private javax.swing.JTextField data;
    private javax.swing.JButton delete;
    private javax.swing.JTextField descProduto;
    private javax.swing.JButton fecharV;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pesquisar;
    private javax.swing.JButton pesquisarV;
    private javax.swing.JTextField preco1;
    private javax.swing.JTextField quant;
    private javax.swing.JTextField quantidade;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField valor;
    // End of variables declaration//GEN-END:variables
}
