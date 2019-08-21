package Factory_Pattern;

public abstract class PizzaStore {

	abstract Pizza createpizza(String type);
	void orderpizza (Pizza pz){
		pz.prepare();
		pz.box();
	}
}
