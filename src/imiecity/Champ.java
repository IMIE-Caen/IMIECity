/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imiecity;

/**
 *
 * @author doskyft
 */
public class Champ extends Lieu {
    public Champ(String nom) {
        super(nom);
    }

    @Override
    public void process() {
        incrementerStock(Ressource.BLE);

    }
}
