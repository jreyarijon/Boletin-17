/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol_17_2;

/**
 *
 * @author Josemolamazo
 */
public class Bol_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Avestruz truz = new Avestruz();
         System.out.println("**Avestruz**");
         truz.Moverse();
         
         Papagaio gaio = new Papagaio();
         System.out.println("**Papagaio**");
         gaio.Moverse();
         gaio.Voar();
         
         Morcego cego = new Morcego();
         System.out.println("**Morcego**");
         cego.Moverse();
         cego.Voar();
         
         Gato luffy = new Gato();
         System.out.println("**Gato**");
         luffy.Moverse();
         luffy.Nadar();
         
         Tigre gre = new Tigre();
         System.out.println("**Tigre**");
         gre.Moverse();
         gre.Nadar();
    }
    
}
