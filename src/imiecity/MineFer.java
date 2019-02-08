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
public class MineFer extends Lieu {

    public MineFer(String nom) {
        super(nom);
    }

    public void process() {
        incrementerStock(Ressource.FER);
    }
    
}
