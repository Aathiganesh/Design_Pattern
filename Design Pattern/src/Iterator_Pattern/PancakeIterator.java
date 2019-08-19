package Iterator_Pattern;

public class PancakeIterator implements Iterator{

	String ss[];
	int pos = 0;
	public PancakeIterator(String ssq[]) {
		this.ss = ssq;
	}
	
	public void next() {
		// TODO Auto-generated method stub
		System.out.println(ss[pos]);
		pos++;
	}
}
