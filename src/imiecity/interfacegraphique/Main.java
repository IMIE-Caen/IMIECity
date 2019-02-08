/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imiecity.interfacegraphique;

import imiecity.core.Monde;
import imiecity.core.Processable;
import static java.lang.Thread.sleep;



/**
 *
 * @author clmntlxndr
 */
public class Main {
    public static void main(String args[]) throws Exception{
       new FenetrePrincipale();
       while(true){
           for(Processable p : Monde.getInstance().getProcessables()){
                p.process();
           }
           sleep(400);
       }

    }

    private static void process() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
