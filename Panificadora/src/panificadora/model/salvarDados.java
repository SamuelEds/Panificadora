package panificadora.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class salvarDados {
    String codigo;
    String nome;
    String usuario;
    String cpf;
    String sobrenome;
    String senha;
    String uf;

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
    
    

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
            FileWriter ler = new FileWriter("../Panificadora/Clientes/Cliente"+codigo+"/Cliente"+codigo+".txt",false);
            
            //Escrev3er no arquivo criado as informações de Cadastro (Usuário)
            PrintWriter escrever = new PrintWriter(ler);
            
            //Escrever as Informações
            
            escrever.println(this.usuario);
            escrever.println(this.senha);
            escrever.println(this.nome);
            escrever.println(this.cpf);
            escrever.println(this.sobrenome);
            escrever.println(this.uf);
            escrever.println(this.codigo);

             //Enviar os dados
            escrever.flush();
            
            //Fechar Arquivo de Escrita
            escrever.close();
            
            //Fechar arquivo de Leitura
            ler.close();
        }catch(IOException erro){
            
        Logger.getLogger(salvarDados.class.getName()).log(Level.SEVERE, null, erro);
        }
        return "Conta Atualizada";
    }
            public String Excluir(String codigo){
            
            
            File f = new File("../Panificadora/Clientes/Cliente"+codigo+"/Cliente"+codigo+".txt");
            f.delete();
          return "Conta Deletada";
        } 
        
        public String SalvarNovosDados(){
            
            try {
            
            //Criar Arquivo para guardar as informações de Cadastro (Usuário)
            FileWriter ler = new FileWriter("../Panificadora/Clientes/Cliente"+codigo+"/Cliente"+codigo+".txt",false);
            
            //Escrev3er no arquivo criado as informações de Cadastro (Usuário)
            PrintWriter escrever = new PrintWriter(ler);
            
            //Escrever as Informações
            
            escrever.println(this.usuario);
            escrever.println(this.senha);
            escrever.println(this.nome);
            escrever.println(this.cpf);
            escrever.println(this.sobrenome);
            escrever.println(this.uf);
            escrever.println(this.codigo);

             //Enviar os dados
            escrever.flush();
            
            //Fechar Arquivo de Escrita
            escrever.close();
            
            //Fechar arquivo de Leitura
            ler.close();
        }catch(IOException erro){
            
        Logger.getLogger(salvarDados.class.getName()).log(Level.SEVERE, null, erro);
        }
            
            return "Nova Conta Cadastrada";
        }
        public void Criarpastas(){
            File f = new File("../Panificadora/Clientes/Cliente"+codigo);
            f.mkdirs();
        }
        public void ExcluirProdutoCliente(String cod){
            File f = new File("../Panificadora/Clientes/Cliente"+cod+"/Compra"+cod+".txt");
            f.delete();
        }
}
