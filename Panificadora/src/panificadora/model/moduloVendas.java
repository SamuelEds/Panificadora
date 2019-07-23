package panificadora.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class moduloVendas {

    String codigo_do_Produto;
    String Nome_Do_Produto;
    String valor_Produto;
    String Quantidade;
    String Data_de_Compra;
    String preco_final;
    String codigoCliente;

    public String getCodigo_do_Produto() {
        return codigo_do_Produto;
    }

    public void setCodigo_do_Produto(String codigo_do_Produto) {
        this.codigo_do_Produto = codigo_do_Produto;
    }

    public String getNome_Do_Produto() {
        return Nome_Do_Produto;
    }

    public void setNome_Do_Produto(String Nome_Do_Produto) {
        this.Nome_Do_Produto = Nome_Do_Produto;
    }

    public String getValor_Produto() {
        return valor_Produto;
    }

    public void setValor_Produto(String valor_Produto) {
        this.valor_Produto = valor_Produto;
    }

    public String getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(String Quantidade) {
        this.Quantidade = Quantidade;
    }

    public String getData_de_Compra() {
        return Data_de_Compra;
    }

    public void setData_de_Compra(String Data_de_Compra) {
        this.Data_de_Compra = Data_de_Compra;
    }

    public String getPreco_final() {
        return preco_final;
    }

    public void setPreco_final(String preço_final) {
        this.preco_final = preço_final;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String SalvarCompra() {
        try {

            FileWriter fw = new FileWriter("../Panificadora/Clientes/Cliente" + codigoCliente + "/Compra" + codigo_do_Produto + ".txt", false);
            PrintWriter pw = new PrintWriter(fw);

            pw.println(this.codigo_do_Produto);
            pw.println(this.Nome_Do_Produto);
            pw.println(this.Quantidade);
            pw.println(this.valor_Produto);
            pw.println(this.preco_final);
            pw.println(this.codigoCliente);
            pw.println(this.Data_de_Compra);

            pw.flush();
            pw.close();
            fw.close();
        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar dados da compra!", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
        return "Compra Efetuada com Sucesso!";
    }

    public boolean VerificarQuantidade(String cod) {
        boolean check = false;

        try {
            BufferedReader bf = new BufferedReader(new FileReader("../Panificadora/Produtos/Produto" + cod + ".txt"));
            bf.readLine();
            bf.readLine();
            bf.readLine();
            bf.readLine();
            bf.readLine();
            bf.readLine();
            int p = Integer.parseInt(bf.readLine());
            if (p > 0) {
                check = true;
            }else{
                JOptionPane.showMessageDialog(null,"Quantidade Insuficiente!","Aviso",JOptionPane.ERROR_MESSAGE);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(moduloVendas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(moduloVendas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return check;
    }

}
