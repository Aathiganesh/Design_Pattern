package Iterator_Pattern;

public class PancakeHouseMenu implements Menu {
	String [] ss;

	public PancakeHouseMenu () {
		ss = new String[2];
		ss[0] = "vennila";
		ss[1] = "strawberry";
	}
	public Iterator Createiterator() {
		// TODO Auto-generated method stub
		return new PancakeIterator(ss);
	}
}
