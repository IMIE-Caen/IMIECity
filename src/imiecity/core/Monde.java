package imiecity.core;

import java.util.ArrayList;


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

            // nouveauLieu.addObserver(new ConsoleObserveur());

        }

    }
    public ArrayList<Processable> getProcessables(){
        ArrayList<Processable> tab = new ArrayList();
        tab.addAll(lieux);
        tab.addAll(flux);
        return tab;
    }
    
}