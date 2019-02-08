package imiecity.core;

import java.util.Scanner;
import java.util.ArrayList;

public class interfaceUtilisateur {
    
    public boolean quit = false;
    static Scanner reader = new Scanner(System.in);  // Reading from System.in
    
    public void menu(){
        System.out.println("Que voulez-vous faire ?");
        System.out.println("1 : Créer flux");
        System.out.println("2 : Assigner ouvrier");
        System.out.println("3 : Prochain tour");
        
        int n = reader.nextInt(); // Scans the next token of the input as an int.
        
        if(n == 1){creerFlux();}
        else if(n == 2){assignerOuvrier();}
        else {prochainTour();}
        
        
        
    }
    
    private void creerFlux(){
        
        ArrayList<Lieu> listeLieu = Monde.lieux;
        
        //Choix de l'origine
        System.out.println("Veuillez saisir une origine:");
        for(int i=0; i<listeLieu.size(); i++){
            System.out.println((i+1) + ":" + listeLieu.get(i));
        }

        int origine = reader.nextInt(); 
       
        Lieu origineChoisi = listeLieu.get(origine-1);
        System.out.println(origineChoisi);
        
        //Choix de la destination
        System.out.println("Veuillez saisir une destination:");
        for(int i=0; i<listeLieu.size(); i++){
            System.out.println((i+1) + ":" + listeLieu.get(i));
        }

        int destination = reader.nextInt();
       
        Lieu destinationChoisi = listeLieu.get(destination-1);
        System.out.println(destinationChoisi);
        
        //Choix de la ressource
        System.out.println("Veuillez choisir une ressource :");
        for(int i=0; i<Ressource.TAB.length-1; i++){
            System.out.println((i+1) + ":" + Ressource.TAB[i]);
        }
        
        int ressource = (reader.nextInt())-1;
        
        Flux flux = new Flux(origineChoisi, destinationChoisi, ressource);
        System.out.println(flux);
        
        Monde.flux.add(flux);
        
        menu();
    }
    
    private void assignerOuvrier(){
        ArrayList<Lieu> listeLieu = Monde.lieux;
        
        System.out.println("Dans quel lieu ?");
        for(int i=0; i<listeLieu.size(); i++){
            System.out.println((i+1) + ":" + listeLieu.get(i));
        }
        
        int m = reader.nextInt(); // Scans the next token of the input as an int.
        
        Lieu lieuChoisi = listeLieu.get(m-1);
        
        int x=0;
        while(x != 3){
            int nombreOuvrier = lieuChoisi.getStock(Ressource.OUVRIER);
            System.out.println("Nombre d'ouvrier : " + nombreOuvrier);
            System.out.println("1 : Ajouter un ouvrier");
            System.out.println("2 : Retirer un ouvrier");
            System.out.println("3 : Quitter");
            
            x = reader.nextInt(); // Scans the next token of the input as an int.
            
            if(x == 1){
                lieuChoisi.incrementerStock(Ressource.OUVRIER);
            }
            else if(x == 2){
                lieuChoisi.decrementerStock(Ressource.OUVRIER);
            }
        }
            
        menu();
        
    }
    
    private void prochainTour(){

        quit = true;
    }
}
