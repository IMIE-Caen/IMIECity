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
        int stockArbreActuel = getStock(Ressource.ARBRE) ;
        if(stockArbreActuel == 0 )
            return ;
       
        int stockPlancheActuel = getStock(Ressource.PLANCHE);
        stock.put(Ressource.PLANCHE, stockPlancheActuel + 2);
        stock.put(Ressource.ARBRE, stockArbreActuel - 1);
    }
    
}
