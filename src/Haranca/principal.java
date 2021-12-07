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
public class principal {
     public static void main (String []args) {
         Automovel carro = new Automovel();
         Automovel moto = new Automovel ();
         
         carro.setNumplaca ("HPH-3333");
         carro.setCor ("Vermelho");
         carro.setNumporta(4);
         carro.setNumerorodas(4);
         carro.setCapacidae(5)
               
         moto.setNumplaca("HDD-9482");
         moto.setCor("Vemelho");
         moto.setNumporta(0);
         moto.setNumerorodas(2);
         moto.setCapacidae(2)
                 
                 
          carro.imptimirdadoscarro();
          moto.imptimirdadosmoto();
}
}