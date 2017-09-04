/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author herquiloidehele
 */
public class CartaoMcel extends SIM implements Serializable{
  
    private String localizacao;
    private String loja;

    public CartaoMcel(int id, String localizacao, String loja, String proprietario, String numero) {
        super(id, proprietario, numero);
        this.localizacao = localizacao;
        this.loja = loja;
    }
    
     
    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getLoja() {
        return loja;
    }

    public void setLoja(String loja) {
        this.loja = loja;
    }
  

    @Override
    public boolean recarregar(double valor) {
        System.out.println("Recarga Mcel");
        if(valor > 0){
            double bonus = valor*0.5;
            this.setSaldo(this.getSaldo() + valor + bonus);
            return true;
        }
        return false;
    }
    
    public boolean recarregar(double valor, double bonus){
       if(valor > 0){
            this.setSaldo(this.getSaldo() + valor + bonus);
            return true;
        }
        return false;
    }
    
    
}
