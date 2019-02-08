/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package imiecity.core;

/**
 *
 * @author clement
 */
public class Flux implements Processable {
    public final Lieu destination;
    public final Lieu origine ;
    public final int ressourceTransportee;

    public Flux(Lieu origine, Lieu destination, int ressourceTransportee) {
        this.destination = destination;
        this.origine = origine;
        this.ressourceTransportee = ressourceTransportee;
    }
    
    public void process(){
        if(origine.getStock(ressourceTransportee) <= 0)
            return;
        origine.decrementerStock(ressourceTransportee);
        destination.incrementerStock(ressourceTransportee);
    }

    @Override
    public String toString() {
        return "Flux{" + Ressource.nom(ressourceTransportee) + " de " + origine.nom+':'+origine.hashCode() + " à " + destination.nom +':'+destination.hashCode()+'}';
    }
    
    
    
}
