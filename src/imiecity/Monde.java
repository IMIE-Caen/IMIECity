/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imiecity;

import java.util.ArrayList;

/**
 *
 * @author clmntlxndr
 */









public class Monde {
    
    public static ArrayList<Lieu> lieux = new ArrayList();
    public static ArrayList<Flux> flux = new ArrayList();
    
    private static Monde instance =null; 
     
     
    public static Monde getInstance(){
        if( instance != null )
            return instance;
        else
            return (instance = new Monde());
    }
     
    private Monde(){
        
       

        for(int i = 0 ; i < 4 ; i++){
            Lieu nouveauLieu = Lieu.auHasard();
            lieux.add(nouveauLieu) ;

            nouveauLieu.addObserveur(new ConsoleObserveur());

        }
        
    }
    public ArrayList<Processable> getProcessables(){
        ArrayList<Processable> tab = new ArrayList();
        tab.addAll(lieux);
        tab.addAll(flux);
        return tab;
    }
    
}
