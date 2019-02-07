package imiecity;

import java.util.ArrayList;


public class Monde {
    
    ArrayList<Lieu> lieux = new ArrayList();
    ArrayList<Flux> flux = new ArrayList();
    
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
    }
    public ArrayList<Processable> getProcessables(){
        ArrayList<Processable> tab = new ArrayList();
        tab.addAll(lieux);
        tab.addAll(flux);
        return tab;
    }
    
}