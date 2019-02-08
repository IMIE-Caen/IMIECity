package imiecity;

public class MineFer extends Lieu{

	public MineFer(String nom) {
		super(nom);
	}
	
	@Override
    public void process() {
        incrementerStock(Ressource.FER);
    }
}
