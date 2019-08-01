package Strategy_Pattern;

public class Mute implements QuackBehaviour{

	public void quack () {
		System.out.println("only mute");
	}
}
