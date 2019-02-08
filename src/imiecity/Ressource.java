
package imiecity;

public class Ressource {
    public final static int ARBRE=0;
    public final static int PLANCHE=1;
    public final static int FER=2;
    public final static int CHARBON=3;

    public final static int ACIER=4;
    public final static int OUVRIER=5; // TOUJOURS EN DERNIER
    public final static String TAB[]=  {"Arbre", "Planche", "Fer", "Charbon","Acier", "Ouvrier"};
    
    public static String nom(int ressourceId){
        return TAB[ressourceId];
    }     

    
}
