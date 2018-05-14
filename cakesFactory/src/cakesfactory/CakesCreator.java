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
public class CakesCreator {
    public static Cakes getCake(CakeType criteria) {
        switch (criteria) {
            case CHOCOLATE:
                return new Chocolate();
            case FRUTAS:
                return new Frutal();
            case CARAMELO:
                return new Caramelo();
        }
        return null;
    }
}
