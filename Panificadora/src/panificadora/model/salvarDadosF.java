package panificadora.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class salvarDadosF {
    String codigo;
    String nome;
    String usuario;
    String cpf;
    String sobrenome;
    String senha;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
       public String SalvaDados(){
        try {
            
            //Criar Arquivo para guardar as informações de Cadastro (Usuário)
            FileWriter ler = new FileWriter("../Panificadora/Funcionarios/Funcionario"+codigo+".txt",false);
            
            //Escrev3er no arquivo criado as informações de Cadastro (Usuário)
            PrintWriter escrever = new PrintWriter(ler);
            
            //Escrever as Informações
            escrever.println(this.senha);
            escrever.println(this.usuario);
            escrever.println(this.codigo);
            escrever.println(this.nome);
            escrever.println(this.cpf);
            escrever.println(this.sobrenome);
             
             //Enviar os dados
            escrever.flush();
            
            //Fechar Arquivo de Escrita
            escrever.close();
            
            //Fechar arquivo de Leitura
            ler.close();
        }catch(IOException erro){
            
        Logger.getLogger(salvarDados.class.getName()).log(Level.SEVERE, null, erro);
        }
        return "Funcionário Cadastrado";
    }
           public String Atualizar(){
        try {
            
            //Criar Arquivo para guardar as informações de Cadastro (Usuário)
            FileWriter ler = new FileWriter("../Panificadora/Funcionarios/Funcionario"+codigo+".txt",false);
            
            //Escrev3er no arquivo criado as informações de Cadastro (Usuário)
            PrintWriter escrever = new PrintWriter(ler);
            
            //Escrever as Informações
             escrever.println(this.senha);
            escrever.println(this.usuario);
            escrever.println(this.codigo);
            escrever.println(this.nome);
            escrever.println(this.cpf);
            escrever.println(this.sobrenome);
             
             //Enviar os dados
            escrever.flush();
            
            //Fechar Arquivo de Escrita
            escrever.close();
            
            //Fechar arquivo de Leitura
            ler.close();
        }catch(IOException erro){
            
        Logger.getLogger(salvarDados.class.getName()).log(Level.SEVERE, null, erro);
        }
        return "Funcionário Atualizado";
    }
            public String Excluir(String codigos){
            
            
            File f = new File("../Panificadora/Funcionarios/Funcionario"+codigos+".txt");
            f.delete();
            return "Conta Deletada";
        } 
}
