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

        Lieu sherwood = new Foret("sherwood");
        Lieu scierie = new Scierie("siri");
        
            
        Flux flux1 = new Flux(sherwood, scierie, Ressource.ARBRE);
        
        
        ArrayList<Processable> tab = new ArrayList();
        tab.add(scierie);
        tab.add(sherwood);
        tab.add(flux1);
        
               
        while(true){
            for( Processable lieuOuFlux : tab){
                lieuOuFlux.process();
                System.out.println(lieuOuFlux);
            }
           
            sleep(2000);
            
        }
        
     //   System.out.println(flux1);     
       // System.out.println(foret.getStock("arbre"));
       

        
    }
    
}
