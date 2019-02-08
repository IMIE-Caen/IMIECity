/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package imiecity;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author clement
 */
public abstract class Lieu implements Processable{
   
    public final String nom;
    public ArrayList<ConsoleObserveur> observeurs = new ArrayList();
  
 
    private HashMap<Integer, Integer> stock = new HashMap();

    public Lieu(String nom) {
        this.nom = nom;
    }
    
    public int getStock(int ressource){
        return stock.containsKey(ressource) ? stock.get(ressource) : 0 ;
    }

    public static Lieu auHasard(){
        if(Math.random() > 0.5){
           return new MineFer("Fer"); 
        }elseif(Math.random() > 0.5) {
        	return new MineCharbon("Charbon");
        }elseif(Math.random() > 0.5) {
        	return new MineCharbon("Scierie");
        }return new MineCharbon("Arbre");
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
            notifierLesObserveurs();
            stock.put(ressourceId, stockActuel - 1);
        }
    }

    void incrementerStock(int ressourceId) {
        int stockActuel = getStock(ressourceId);
        notifierLesObserveurs();
        stock.put(ressourceId, stockActuel + 1);
    }
    
    private void notifierLesObserveurs(){
        for(ConsoleObserveur ob : observeurs){
            ob.notifier(this);
        }
        
    }

    void addObserveur(ConsoleObserveur ob) {
        observeurs.add(ob);
    }
  
    
    
    
}
