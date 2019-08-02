package Observer_Pattern;

public class SimpleObseerver implements Observer {

	private SimpleSubject ss;
	private int val;
	
	public SimpleObseerver(SimpleSubject ss) {
		this.ss = ss;
		ss.registerobserver(this);
	}
	public void update(int value) {
		// TODO Auto-generated method stub
		
	this.val = value;
	System.out.println("value from subject" + val);
	}

}
