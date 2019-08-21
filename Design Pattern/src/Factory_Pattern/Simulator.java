package Factory_Pattern;

public class Simulator {
	public static void main (String args[]) {
		Pizza pz;
		
		PizzaStore cps = new ChicagoPizzaStore();
		pz = cps.createpizza("veggie");
		cps.orderpizza(pz);
		
	}
}
