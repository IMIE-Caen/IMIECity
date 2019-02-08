/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imiecity.core;

/**
 *
 * @author clmntlxndr
 */
public class MineCharbon extends Lieu {

    public MineCharbon(String nom) {
        super(nom);
    }

    public void process() {
        incrementerStock(Ressource.CHARBON);
    }
    
}
