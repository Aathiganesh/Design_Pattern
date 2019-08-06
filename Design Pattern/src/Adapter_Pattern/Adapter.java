package Adapter_Pattern;

public class Adapter implements Duck{

	Drone sd;
	
	public Adapter (Drone sd1) {
		this.sd = sd1;
	}

	public void fly() {
		// TODO Auto-generated method stub
		sd.beep();
		sd.takeoff();
	}

	public void quack() {
		// TODO Auto-generated method stub
		sd.spin();
	}

}
