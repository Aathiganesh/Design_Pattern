package Strategy_Pattern;

public abstract class Duck {
	FlyBehaviour fb;
	QuackBehaviour qb;

	public void performfly() {
		fb.fly();
	}
	public void performquack() {
		qb.quack();
	}
	abstract void display();
	public void swim () {
		System.out.println("can swim");
	}
}