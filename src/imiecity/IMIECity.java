/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imiecity;

import static java.lang.Thread.sleep;
import java.util.ArrayList;




/**
 *
 * @author clement
 */
public class IMIECity {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        ArrayList<Lieu> lieux = new ArrayList();
        ArrayList<Flux> flux = new ArrayList();
        
        for(int i = 0 ; i < 4 ; i++){
           Lieu nouveauLieu = Lieu.auHasard();
           lieux.add(nouveauLieu) ;

           nouveauLieu.addObserveur(new ConsoleObserveur());
           
        }
        for(int i = 0 ; i < 3 ; i++){
            
            int randOrigine = (int)(Math.random() * (lieux.size()));
            
            int randDest;
            do {
                randDest = (int)(Math.random() * (lieux.size()));
            } while(randDest == randOrigine);
            
            Lieu origine= lieux.get(randOrigine);
            Lieu destination= lieux.get(randDest);
            
            // ça aussi c'est moche
            int ressource = (int)(Math.random() * (2));
            
            flux.add(new Flux(origine, destination, ressource));
            
        }
        
        ArrayList<Processable> tab = new ArrayList();
        tab.addAll(lieux);
        tab.addAll(flux);
        
        while(true){
            for( Processable lieuOuFlux : tab){
                lieuOuFlux.process();
            }
            
            sleep(2000);
            
        }
        
     //   System.out.println(flux1);     
       // System.out.println(foret.getStock("arbre"));
       

        
    }
    
}
