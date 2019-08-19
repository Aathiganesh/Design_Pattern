package Iterator_Pattern;

public class Simulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PancakeHouseMenu pc = new PancakeHouseMenu();
		Iterator it = pc.Createiterator();
		it.next();
		it.next();
		DinnerMenu dm = new DinnerMenu();
		Iterator itq = dm.Createiterator();
		itq.next();
		itq.next();
		itq.next();
	}

}
