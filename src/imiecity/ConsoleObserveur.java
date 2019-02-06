/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imiecity;

/**
 *
 * @author clmntlxndr
 */
public class ConsoleObserveur {

    Lieu observable;

    public ConsoleObserveur(Lieu observable) {
        this.observable = observable;
    }
    
    
    
    void notifier() {
        System.out.println(observable.toString());
    }
    
    
    
}