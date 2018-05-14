/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cakesfactory;

/**
 *An implement of (@link Cakes)
 * @author Oscar Lovato
 */
public class Chocolate implements Cakes {
     @Override
    public void cocinar (){
        System.out.println("COCINANDO EL PASTEL....:P");
    }
    @Override
    public void decoracion (){
        System.out.println("COLOCANDO CHOCOLATE EN EL PASTEL");
    }
    
}
