/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cakesfactory;

/**
 *
 * @author Oscar Lovato
 */
public class CakesFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cakes pastel = CakesCreator.getCake(CakeType.CHOCOLATE);
        pastel.cocinar();
        pastel.decoracion();
        
        pastel = CakesCreator.getCake(CakeType.FRUTAS);
        pastel.cocinar();
        pastel.decoracion();
        
        pastel = CakesCreator.getCake(CakeType.CARAMELO);
        pastel.cocinar();
        pastel.decoracion();

    }
    
}
