/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package imiecity.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author clement
 */
public abstract class Lieu extends Observable implements Processable{
   
    public final String nom;
    public ArrayList<Observer> observeurs = new ArrayList();
  
 
    private HashMap<Integer, Integer> stock = new HashMap();

    public Lieu(String nom) {
        this.nom = nom;
    }
    
    public int getStock(int ressource){
        return stock.containsKey(ressource) ? stock.get(ressource) : 0 ;
    }

    public static Lieu auHasard(){
        double rand = Math.random();
        if(rand < 0.25)
           return new MineFer("Mine de Fer");
       
        else if( rand < 0.50)
           return new MineCharbon("Mine de Charbon"); 
           
       else if( rand < 0.75)
           return new Scierie("Scierie");
          
       return new Foret("Forêt");
    }
    
    @Override
    public String toString() {
        String stockStr ="" ;
        for(int ressourceId : stock.keySet()){
            stockStr += Ressource.nom(ressourceId) + ": " + stock.get(ressourceId) + " - ";
        }
        
        return "Lieu{" + nom +':'+ hashCode() + " -- stock: " + stockStr + '}';
    }

    void decrementerStock(int ressourceId) {
        int stockActuel = getStock(ressourceId);
        if(stockActuel > 0){
            setChanged();
            notifyObservers();
            stock.put(ressourceId, stockActuel - 1);
        }
    }

    void incrementerStock(int ressourceId) {
        int stockActuel = getStock(ressourceId);
        setChanged();
        notifyObservers();
        stock.put(ressourceId, stockActuel + 1);
    }
    

    
    
}
