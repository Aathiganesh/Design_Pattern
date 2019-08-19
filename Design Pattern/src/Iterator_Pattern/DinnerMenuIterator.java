package Iterator_Pattern;

import java.util.ArrayList;

public class DinnerMenuIterator implements Iterator {

	ArrayList al;
	int pos = 0;
	public DinnerMenuIterator(ArrayList ar) {
		this.al = ar;
	}
	public void next() {
		// TODO Auto-generated method stub
		System.out.println(al.get(pos));
		pos++;
	}

}
