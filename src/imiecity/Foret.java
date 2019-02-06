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
public class Foret extends Lieu {

    public Foret(String nom) {
        super(nom);
    }

    @Override
    public void process() {
        int stockArbreActuel = getStock(Ressource.ARBRE);
        stock.put(Ressource.ARBRE, stockArbreActuel +1);
    }
    
}
