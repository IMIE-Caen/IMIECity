/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package imiecity;

import java.util.HashMap;

/**
 *
 * @author clement
 */
public abstract class Lieu {
   
  public final String nom;
  
 
    protected HashMap<Integer, Integer> stock = new HashMap();

    public Lieu(String nom) {
        this.nom = nom;
    }
    
    public int getStock(int ressource){
        if(! stock.containsKey(ressource) ){
            return 0;
        }
        return stock.get(ressource);
    }

    
    abstract public void process();
    
    
    
    
    @Override
    public String toString() {
        return "Lieu{" + "nom=" + nom + ", stockProduit=" + stock + '}';
    }
  
    
    
    
}
