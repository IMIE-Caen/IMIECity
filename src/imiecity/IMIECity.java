package imiecity;

import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class IMIECity {

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