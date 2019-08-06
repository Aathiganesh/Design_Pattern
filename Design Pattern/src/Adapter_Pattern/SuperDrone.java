package Adapter_Pattern;

public class SuperDrone implements Drone {

	public void spin() {
		// TODO Auto-generated method stub
		System.out.println("Super drone can spin");
		
	}

	public void beep() {
		// TODO Auto-generated method stub
		System.out.println("super drone can not beep");
	}

	public void takeoff() {
		// TODO Auto-generated method stub
		System.out.println("super drone can take off");
	}
}
