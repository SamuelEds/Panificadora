package panificadora.view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        senha = new javax.swing.JPasswordField();
        Enviar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        selecione = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Selecione:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(100, 300, 190, 30);

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Código:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(150, 150, 150, 40);
        getContentPane().add(codigo);
        codigo.setBounds(310, 150, 310, 40);
        getContentPane().add(senha);
        senha.setBounds(310, 250, 310, 40);

        Enviar.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        Enviar.setText("Enviar");
        Enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarActionPerformed(evt);
            }
        });
        getContentPane().add(Enviar);
        Enviar.setBounds(390, 390, 120, 40);

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 3, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Usuário:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(140, 210, 160, 30);
        getContentPane().add(usuario);
        usuario.setBounds(310, 200, 310, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LOGIN");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(240, 50, 220, 40);

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 3, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Senha:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(160, 260, 130, 30);

        selecione.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Fornecedor", "Cliente", "Funcionarios" }));
        selecione.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecioneActionPerformed(evt);
            }
        });
        getContentPane().add(selecione);
        selecione.setBounds(310, 300, 130, 30);

        jButton1.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(180, 390, 140, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panificadora/imagens/telaPreta.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 40, 580, 410);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panificadora/imagens/fundoAmarelo.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(1, 0, 750, 520);

        setSize(new java.awt.Dimension(771, 556));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void EnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarActionPerformed
        try {
            String sel = (String)selecione.getSelectedItem();
            if (sel.equalsIgnoreCase("Fornecedor")) {
                
            String cod = codigo.getText();
            File fil = new File("../Panificadora/Produtos/Produto"+cod+".txt");
            
            BufferedReader bf = new BufferedReader(new FileReader(fil));
            
            String usu = bf.readLine();
            String sen = bf.readLine();
          
            
            String s = String.valueOf(senha.getPassword());
            String co = JOptionPane.showInputDialog("Digite o código: ");
            if(usu.equalsIgnoreCase(usuario.getText()) && sen.equals(s) && co.contains("for")){
                    new Home().setVisible(true);
                    dispose();
            }else {
                    JOptionPane.showMessageDialog(null,"Senha/Usuário Incorretos!","Aviso",JOptionPane.ERROR_MESSAGE);
            }
            }else if(sel.equalsIgnoreCase("Cliente")){
            
                String cod = codigo.getText();
                File fil = new File("../Panificadora/Clientes/Cliente"+cod+"/Cliente"+cod+".txt");
            
                BufferedReader bf = new BufferedReader(new FileReader(fil));
            
                String usuC = bf.readLine();
                String senC = bf.readLine();
          
            
                String s = String.valueOf(senha.getPassword());
                if(usuC.equalsIgnoreCase(usuario.getText()) && senC.equals(s)){
                        new TelaVendas().setVisible(true);
                        dispose();
                }else {
                        JOptionPane.showMessageDialog(null,"Senha/Usuário Incorretos!","Aviso",JOptionPane.ERROR_MESSAGE);
                }
            }
            else if(sel.equals("Funcionarios")){
                String cod = JOptionPane.showInputDialog("Digite o código:");
                if(cod.contains("fun")){
                        String codi = codigo.getText();
                        File f = new File("../Panificadora/Funcionarios/Funcionario"+codi+".txt");
                        
                        BufferedReader bf = new BufferedReader(new FileReader(f));
                        
                        String senC = bf.readLine();
                        String usuC = bf.readLine();
                        
          
            
                        String s = String.valueOf(senha.getPassword());
                    if(usuC.equalsIgnoreCase(usuario.getText()) && senC.equals(s)){
                        new Home().setVisible(true);
                        dispose();
                    }else {
                        JOptionPane.showMessageDialog(null,"Senha/Usuário Incorretos!","Aviso",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_EnviarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Object itens[] = {"Cliente","Funcionário(a)","Produto"};
        Object sel = JOptionPane.showInputDialog(null,"Escolha:","Opção:",JOptionPane.INFORMATION_MESSAGE,null,itens,itens[0]);
        
        if(sel.equals("Cliente")){
            new TelaCadastroClientes01().setVisible(true);
            dispose();
        }else if(sel.equals("Funcionário(a)")){
            String sen = JOptionPane.showInputDialog(null,"Digite o código de Funcionário");
            if(sen.contains("fun")){
                new TelaFuncionario01().setVisible(true);
                dispose();
            }
        }else if(sel.equals("Produto")){
            String sen = JOptionPane.showInputDialog(null,"Digite o código de Fornecedor");
            if(sen.contains("for")){
                new TelaProduto01().setVisible(true);
                dispose();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void selecioneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecioneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selecioneActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Enviar;
    private javax.swing.JTextField codigo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox<String> selecione;
    private javax.swing.JPasswordField senha;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
