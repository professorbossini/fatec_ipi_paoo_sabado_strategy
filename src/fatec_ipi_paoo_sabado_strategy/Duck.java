package fatec_ipi_paoo_sabado_strategy;

public abstract class Duck {
	
	FlyBehavior flyBehavior;
	
	QuackBehavior quackBehavior;
	
	public void swim () {
		System.out.println("Swiming");
	}
	
	public abstract void display ();

}
