/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

/**
 *
 * @author Néstor Aldana <nexxtor at naldana.com>
 */
public class Patrones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Singleton s1, s2;
        
        s1 = Singleton.getInstance();
        System.out.println(s1);
       
        s2 = Singleton.getInstance();
        System.out.println(s2);
    }
    
}
