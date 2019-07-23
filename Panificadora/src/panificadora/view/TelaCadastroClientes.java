package panificadora.view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JOptionPane;
import panificadora.model.salvarDados;

public class TelaCadastroClientes extends javax.swing.JFrame {
    public TelaCadastroClientes() {
        
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        LN = new javax.swing.JLabel();
        LS = new javax.swing.JLabel();
        LU = new javax.swing.JLabel();
        Lc = new javax.swing.JLabel();
        LC = new javax.swing.JLabel();
        Ls = new javax.swing.JLabel();
        Sobre = new javax.swing.JTextField();
        Codigo = new javax.swing.JTextField();
        Nome = new javax.swing.JTextField();
        User = new javax.swing.JTextField();
        Senha = new javax.swing.JPasswordField();
        Cpf = new javax.swing.JFormattedTextField();
        Cadastrar = new javax.swing.JButton();
        limpar = new javax.swing.JButton();
        pesquisar = new javax.swing.JButton();
        alterar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        uf = new javax.swing.JComboBox<>();
        Lc1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro de Clientes");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 10, 420, 70);

        LN.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        LN.setText("Nome:");
        getContentPane().add(LN);
        LN.setBounds(40, 160, 90, 30);

        LS.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        LS.setText("Sobrenome:");
        getContentPane().add(LS);
        LS.setBounds(350, 160, 160, 30);

        LU.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        LU.setText(" Usuário:");
        getContentPane().add(LU);
        LU.setBounds(30, 200, 150, 30);

        Lc.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        Lc.setText("UF:");
        getContentPane().add(Lc);
        Lc.setBounds(420, 260, 60, 29);

        LC.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        LC.setText("Código:");
        getContentPane().add(LC);
        LC.setBounds(40, 120, 100, 30);

        Ls.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        Ls.setText("Senha:");
        getContentPane().add(Ls);
        Ls.setBounds(410, 210, 110, 20);

        Sobre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(Sobre);
        Sobre.setBounds(500, 160, 170, 30);

        Codigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(Codigo);
        Codigo.setBounds(150, 120, 120, 30);

        Nome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(Nome);
        Nome.setBounds(150, 160, 190, 30);

        User.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(User);
        User.setBounds(150, 200, 190, 30);

        Senha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(Senha);
        Senha.setBounds(500, 210, 170, 30);

        try {
            Cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(Cpf);
        Cpf.setBounds(150, 250, 120, 30);

        Cadastrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Cadastrar.setText("Cadastrar");
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(Cadastrar);
        Cadastrar.setBounds(70, 430, 150, 40);

        limpar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        limpar.setText("Limpar");
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });
        getContentPane().add(limpar);
        limpar.setBounds(280, 400, 140, 40);

        pesquisar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pesquisar.setText("Pesquisar");
        pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(pesquisar);
        pesquisar.setBounds(480, 360, 150, 40);

        alterar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        alterar.setText("Alterar");
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });
        getContentPane().add(alterar);
        alterar.setBounds(70, 360, 150, 40);

        excluir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        excluir.setText("Excluir");
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });
        getContentPane().add(excluir);
        excluir.setBounds(480, 430, 150, 40);

        uf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "CE", "BA", "PA", "ES", "PE", "PI", "PB", "RJ", "SP" }));
        getContentPane().add(uf);
        uf.setBounds(500, 260, 90, 30);

        Lc1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        Lc1.setText("CPF:");
        getContentPane().add(Lc1);
        Lc1.setBounds(40, 250, 100, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panificadora/imagens/arrow_undo.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 0, 80, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panificadora/imagens/barraPreta.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-6, -6, 710, 90);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panificadora/imagens/fundoAmarelo.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(-6, 104, 710, 210);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panificadora/imagens/fundoLogin.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-6, 340, 710, 180);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panificadora/imagens/telaBranca.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-6, 0, 710, 520);

        setSize(new java.awt.Dimension(722, 556));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        salvarDados sd = new salvarDados();
        File f = new File("../Panificadora/Clientes/Cliente"+Codigo+"/Cliente"+Codigo+".txt");
        
        try{
        
            int op = Integer.parseInt(JOptionPane.showInputDialog("Deseja\n [1] - Criar uma nova conta\n [2] - Atualizar Conta"));
        
        switch(op){
            case 1:
                
                
               
                sd.setCodigo(Codigo.getText());
                sd.Criarpastas();
                sd.setUsuario(User.getText());
                sd.setSenha(String.valueOf(Senha.getPassword()));
                sd.setNome(Nome.getText());
                sd.setCpf(Cpf.getText());
                sd.setSobrenome(Sobre.getText());
                sd.setUf((String)uf.getSelectedItem());
                
                if(Codigo.getText().equals("") || User.getText().equals("") || Senha.getPassword().equals("") || Cpf.getText().equals("") || Sobre.getText().equals("") || (uf.getSelectedIndex() == 0)){
                    JOptionPane.showMessageDialog(null,"Alguns campos não foram preenchidos","Aviso",JOptionPane.ERROR_MESSAGE);
        
                }else{
                 //Salvar as informações do usuário
                 JOptionPane.showMessageDialog(null, sd.SalvarNovosDados()); 
                }
                
               
            break;
            
            case 2:
                sd.setCodigo(Codigo.getText());
                sd.Criarpastas();
                sd.setUsuario(User.getText());
                sd.setSenha(String.valueOf(Senha.getPassword()));
                sd.setNome(Nome.getText());
                sd.setCpf(Cpf.getText());
                sd.setSobrenome(Sobre.getText());
                sd.setUf((String)uf.getSelectedItem());
                
                if(Codigo.getText().equals("") || User.getText().equals("") || Senha.getPassword().equals("") || Cpf.getText().equals("") || Sobre.getText().equals("") || (uf.getSelectedIndex() == 0)){
                    JOptionPane.showMessageDialog(null,"Alguns campos não foram preenchidos","Aviso",JOptionPane.ERROR_MESSAGE);
        
                }else{
                 //Salvar as informações do usuário
                  JOptionPane.showMessageDialog(null, sd.SalvaDados());  
                }
            break;
             
            default:
                JOptionPane.showMessageDialog(null,"Item inválido ou não atribuído");
            break;    
                
        } 
        
        }catch(java.lang.NumberFormatException erro){
            JOptionPane.showMessageDialog(null,"Item inválido ou não atribuído");
        }

        
        
        Codigo.setEnabled(false);
        Nome.setEnabled(false);
        Cpf.setEnabled(false);
        User.setEnabled(false);
        Senha.setEnabled(false);
        uf.setEnabled(false);
        Sobre.setEnabled(false);
    }//GEN-LAST:event_CadastrarActionPerformed

    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
    Codigo.setText("");
    Nome.setText("");
    User.setText("");
    Cpf.setText("");
    Sobre.setText("");
    Senha.setText("");
    uf.setSelectedIndex(0);
    }//GEN-LAST:event_limparActionPerformed

    private void pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarActionPerformed
if(evt.getSource() == pesquisar){
           try{
               String codigo = JOptionPane.showInputDialog("Digite o Código:");
               
               BufferedReader ler = new BufferedReader(new FileReader("../Panificadora/Clientes/Cliente"+codigo+"/Cliente"+codigo+".txt"));
               
        
        User.setText(ler.readLine());
        Senha.setText(ler.readLine());
        Nome.setText(ler.readLine());
        Cpf.setText(ler.readLine());
        Sobre.setText(ler.readLine());
        uf.setSelectedItem(ler.readLine());
        Codigo.setText(ler.readLine()); 
        
        
        ler.close();
       
           }catch(Exception erro){
               JOptionPane.showMessageDialog(null, "Erro: "+erro.getMessage());
           }
    }
    }//GEN-LAST:event_pesquisarActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
        Nome.setEnabled(true);
        Sobre.setEnabled(true);
        Cpf.setEnabled(true);
        User.setEnabled(true);
        Senha.setEnabled(true);
        uf.setEnabled(true);
        Codigo.setEnabled(true);
    }//GEN-LAST:event_alterarActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
    salvarDados sd = new salvarDados();
    String  codigo = JOptionPane.showInputDialog("Digite o Código: ");
    
    int op = JOptionPane.showConfirmDialog(null,"Se você clicar em SIM abaixo, sua e registros de seus produtos tbm serão perdidos","Atenção",JOptionPane.YES_NO_OPTION);
    if(op == JOptionPane.YES_OPTION){
        JOptionPane.showMessageDialog(null, sd.Excluir(codigo));
        sd.ExcluirProdutoCliente(codigo);
    }
    }//GEN-LAST:event_excluirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Home().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    public static void main(String args[]) {
    try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaCadastroClientes tc = new TelaCadastroClientes();
                tc.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cadastrar;
    private javax.swing.JTextField Codigo;
    private javax.swing.JFormattedTextField Cpf;
    private javax.swing.JLabel LC;
    private javax.swing.JLabel LN;
    private javax.swing.JLabel LS;
    private javax.swing.JLabel LU;
    private javax.swing.JLabel Lc;
    private javax.swing.JLabel Lc1;
    private javax.swing.JLabel Ls;
    private javax.swing.JTextField Nome;
    private javax.swing.JPasswordField Senha;
    private javax.swing.JTextField Sobre;
    private javax.swing.JTextField User;
    private javax.swing.JButton alterar;
    private javax.swing.JButton excluir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton limpar;
    private javax.swing.JButton pesquisar;
    private javax.swing.JComboBox<String> uf;
    // End of variables declaration//GEN-END:variables
}
