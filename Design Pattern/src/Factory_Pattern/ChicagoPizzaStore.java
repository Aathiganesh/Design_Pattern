package Factory_Pattern;

public class ChicagoPizzaStore extends PizzaStore {

	Pizza createpizza(String type) {
		// TODO Auto-generated method stub
		Pizza pz = null;
		if (type == "Cheese") {
			pz = new ChicagoStryleCheesePizza();
		}
		if (type == "veggie") {
			pz = new ChicagoStyleVeggiePizza();
		}
		return pz;
	}
}
