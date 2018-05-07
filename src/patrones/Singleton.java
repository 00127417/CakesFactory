/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

/**
 * Clase ejemplo que aplica el patron Singlenton
 * @author Néstor Aldana <nexxtor at naldana.com>
 */
public class Singleton {
    private static Singleton singleton;
    
    private Singleton(){}
    
    public Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
