/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package imiecity;

/**
 *
 * @author clement
 */
public class Scierie extends Lieu {

    public Scierie(String nom) {
        super(nom);
    }

    @Override
    public void process() {
        int stockArbreActuel = stock.containsKey(Ressource.PLANCHE) ?
                stock.get(Ressource.PLANCHE) : 0;
        stock.put(Ressource.PLANCHE, stockArbreActuel +1);
    }
    
}
