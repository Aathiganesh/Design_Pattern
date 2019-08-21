package Factory_Pattern;

public class NYPizzaStore {

	Pizza createpizza(String type) {
			// TODO Auto-generated method stub
			Pizza pz = null;
			if (type == "Cheese") {
				pz = new NYStyleCheesePizza();
			}
			if (type == "veggie") {
				pz = new NYStyleVeggiePizza();
			}
			return pz;
		}
}
