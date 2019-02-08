package imiecity;

public class MineCharbon extends Lieu{
	public MineCharbon(String nom) {
		super(nom);
	}
	
	@Override
    public void process() {
        incrementerStock(Ressource.CHARBON);
    }
}