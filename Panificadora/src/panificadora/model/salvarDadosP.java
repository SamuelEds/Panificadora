package panificadora.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class salvarDadosP {
    String CodigoPD;
    String NomePD;
    String DataVD;
    String UserDFD;
    String SenhaDFD;
    String preco;
    String quantidade;
    String codigo;

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }
    
    

    public String getCodigoPD() {
        return CodigoPD;
    }

    public void setCodigoPD(String CodigoPD) {
        this.CodigoPD = CodigoPD;
    }

    public String getNomePD() {
        return NomePD;
    }

    public void setNomePD(String NomePD) {
        this.NomePD = NomePD;
    }

    public String getDataVD() {
        return DataVD;
    }

    public void setDataVD(String DataVD) {
        this.DataVD = DataVD;
    }

    public String getUserDFD() {
        return UserDFD;
    }

    public void setUserDFD(String UserDFD) {
        this.UserDFD = UserDFD;
    }

    public String getSenhaDFD() {
        return SenhaDFD;
    }

    public void setSenhaDFD(String SenhaDFD) {
        this.SenhaDFD = SenhaDFD;
    }


    
           public String SalvaDados(){
        try {
            
            //Criar Arquivo para guardar as informações de Cadastro (Usuário)
            FileWriter ler = new FileWriter("../Panificadora/Produtos/Produto"+CodigoPD+".txt",false);
            
            //Escrev3er no arquivo criado as informações de Cadastro (Usuário)
            PrintWriter escrever = new PrintWriter(ler);
            
            //Escrever as Informações
            escrever.println(this.SenhaDFD);
            escrever.println(this.preco);
            escrever.println(this.NomePD);
            escrever.println(this.DataVD);
            escrever.println(this.UserDFD);
            escrever.println(this.CodigoPD);
            escrever.println(this.quantidade);
            
             //Enviar os dados
            escrever.flush();
            
            //Fechar Arquivo de Escrita
            escrever.close();
            
            //Fechar arquivo de Leitura
            ler.close();
        }catch(IOException erro){
            
        Logger.getLogger(salvarDados.class.getName()).log(Level.SEVERE, null, erro);
        }
        return "Produto Cadastrado";
    }
           public String Atualizar(){
        try {
            
            //Criar Arquivo para guardar as informações de Cadastro (Usuário)
            FileWriter ler = new FileWriter("../Panificadora/Produtos/Produto"+CodigoPD+".txt",false);
            
            //Escrev3er no arquivo criado as informações de Cadastro (Usuário)
            PrintWriter escrever = new PrintWriter(ler);
            
            //Escrever as Informações
            escrever.println(this.SenhaDFD);
            escrever.println(this.preco);
            escrever.println(this.NomePD);
            escrever.println(this.DataVD);
            escrever.println(this.UserDFD);
            escrever.println(this.CodigoPD);
            escrever.println(this.quantidade);
            
             
             //Enviar os dados
            escrever.flush();
            
            //Fechar Arquivo de Escrita
            escrever.close();
            
            //Fechar arquivo de Leitura
            ler.close();
        }catch(IOException erro){
            
        Logger.getLogger(salvarDados.class.getName()).log(Level.SEVERE, null, erro);
        }
        return "Produto Atualizado";
    }
            public String Excluir(String codigos){
            
            
            File f = new File("../Panificadora/Produtos/Produto"+codigos+".txt");
            f.delete();
            return "Produto Deletado";
        }
            
}
