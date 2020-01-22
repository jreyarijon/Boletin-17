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
public abstract class Mamifero implements IpodeCamiñar, IpodeNadar, IpodeVoar {

    @Override
    public void Moverse() {
        System.out.println("Pode camiñar");
    }
    @Override
    public void Nadar(){
        System.out.println("Pode nadar");
    }
    @Override
    public void Voar(){
        System.out.println("Pode voar");
    }
}
