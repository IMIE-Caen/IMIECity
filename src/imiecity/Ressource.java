/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package imiecity;


/**
 *
 * @author clement
 */
public class Ressource {
    public final static int ARBRE=0;
    public final static int PLANCHE=1;
    public final static int FER=2;
    public final static int CHARBON=3;
    public final static int OUVRIER=4; // TOUJOURS EN DERNIER
    public final static String TAB[]=  {"Arbre", "Planche", "Fer", "Charbon", "Ouvrier"};
    
    public static String nom(int ressourceId){
        return TAB[ressourceId];
    }     

    
}
