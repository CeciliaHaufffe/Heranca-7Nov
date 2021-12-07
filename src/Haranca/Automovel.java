/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Haranca;

/**
 *
 * @author IFSC
 */
public class Automovel  extends Terrsetre  {
    private String cor; 
    private String numplaca;
    private int numporta;
 
    
    public Automovel (){
        
    }
    
    
     void imptimirdadoscarro (){
        System.out.println ("---CARRO---");
        System.out.println ("Cor : "+ numplaca);
        System.out.println ("Motor:" + cor );
        System.out.println ("Motor:" +numporta );
        System.out.println ("Motor:" +numerorodas );
        System.out.println ("Capacidade:" +capacidae+"pessoas" );
     }
     void imptimirdadosmoto (){
        System.out.println ("---MOTO---");
        System.out.println ("Cor : "+ numplaca);
        System.out.println ("Motor:" + cor );
        System.out.println ("Motor:" +numporta );
        System.out.println ("Motor:" +numerorodas );
         System.out.println ("Capacidade:" +capacidae+"pessoas" );
     }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public String getNumplaca() {
        return numplaca;
    }

    public void setNumplaca(String numplaca) {
        this.numplaca = numplaca;
    }

    public int getNumporta() {
        return numporta;
    }

    public void setNumporta(int numporta) {
        this.numporta = numporta;
    }

    
}
