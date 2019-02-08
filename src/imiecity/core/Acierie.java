package imiecity.core;

public class Acierie extends Lieu{

	public Acierie(String nom) {
		super(nom);
		
	}
	
	public void process() {
		int stockCharbonActuel = getStock(Ressource.CHARBON) ;
		int stockFerActuel = getStock(Ressource.FER);
        if(stockCharbonActuel < 1 || stockFerActuel < 3 ) {return ;}
        decrementerStock(Ressource.CHARBON);
        decrementerStock(Ressource.FER);
        decrementerStock(Ressource.FER);
        decrementerStock(Ressource.FER);
        incrementerStock(Ressource.ACIER);
	}

}
