package Observer_Pattern;

import java.util.ArrayList;

public class SimpleSubject implements Subject {

	private ArrayList <Observer> ar ;
	private Integer val = 0;
	
	public SimpleSubject() {
		ar = new ArrayList<Observer>();
	}
	
	public void registerobserver(Observer observer) {
		// TODO Auto-generated method stub
		ar.add(observer);
		System.out.println("Observer added sucessfully!!");
	}

	public void removeobserver(Observer observer) {
		// TODO Auto-generated method stub
		ar.remove(observer);
	}

	public void notifyobserver(int value) {
		// TODO Auto-generated method stub
		for (int i=0; i<ar.size(); i++) {
			ar.get(i).update(value);
		}
	}

	public void setvalue(int value) {
		// TODO Auto-generated method stub
		val = value;
		notifyobserver(val);
	}
}
