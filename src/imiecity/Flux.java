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
public class Flux extends Processable {
    public final Lieu destination;
    public final Lieu origine ;
    public final int ressourceTransportee;

    public Flux(Lieu origine, Lieu destination, int ressourceTransportee) {
        this.destination = destination;
        this.origine = origine;
        this.ressourceTransportee = ressourceTransportee;
    }
    
    public void process(){
        origine.decrementerStock(ressourceTransportee);
        destination.incrementerStock(ressourceTransportee);
    }

    @Override
    public String toString() {
        return "Flux{" + ressourceTransportee + " de " + origine + " a" + destination +'}';
    }
    
    
    
}
