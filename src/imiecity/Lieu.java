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
        return stock.containsKey(ressource) ? stock.get(ressource) : 0 ;
    }

    
    abstract public void process();
    
    
    
    
    @Override
    public String toString() {
        String stockStr ="" ;
        for(int ressourceId : stock.keySet()){
            stockStr += Ressource.nom(ressourceId) + ": " + stock.get(ressourceId) + " - ";
        }
        
        return "Lieu{" + "nom=" + nom + ", " + stockStr + '}';
    }

    void decrementerStock(int ressourceId) {
        int stockActuel = getStock(ressourceId);
        if(stockActuel > 0)
            stock.put(ressourceId, stockActuel - 1);
    }

    void incrementerStock(int ressourceId) {
        int stockActuel = getStock(ressourceId);
        stock.put(ressourceId, stockActuel + 1);
    }
  
    
    
    
}
