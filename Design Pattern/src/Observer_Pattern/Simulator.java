package Observer_Pattern;

public class Simulator {
	public static void main (String args[]) {
		SimpleSubject ss = new SimpleSubject();
		SimpleObseerver so = new SimpleObseerver(ss);
		
		ss.setvalue(11);
		
	}
}
