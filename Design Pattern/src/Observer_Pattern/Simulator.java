package Observer_Pattern;

public class Simulator {
	public static void main (String args[]) {
		SimpleSubject ss = new SimpleSubject();
		SimpleObseerver so = new SimpleObseerver(ss);
		ss.setvalue(14);
		SimpleObseerver so1 = new SimpleObseerver(ss);
		SimpleObseerver so2 = new SimpleObseerver(ss);
		ss.setvalue(11);
		
		
	}
}
