package Iterator_Pattern;

import java.util.ArrayList;
import java.util.List;

public class DinnerMenu implements Menu{

	ArrayList dm;
	
	public DinnerMenu () {
		dm = new ArrayList();
		dm.add("Idly");
		dm.add("Dosa");
		dm.add("Poori");
	}
	public Iterator Createiterator() {
		// TODO Auto-generated method stub
		return new DinnerMenuIterator(dm);
	}

}
