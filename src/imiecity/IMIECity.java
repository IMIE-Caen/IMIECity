/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imiecity;

import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;




/**
 *
 * @author clement
 */
public class IMIECity {
    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception{
            
            Monde monde = Monde.getInstance();

            while(true){
                for( Processable lieuOuFlux : monde.getProcessables()){
                    lieuOuFlux.process();
                }

               sleep(2000);
            
            }
            
        
    }
    
}
