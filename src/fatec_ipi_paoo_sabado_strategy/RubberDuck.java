package fatec_ipi_paoo_sabado_strategy;

public class RubberDuck extends Duck {

	public void quack () {
		System.out.println("squeak");
	}
	
	@Override
	public void display() {
		System.out.println("Rubber Duck");
	}
	
	@Override
	public void fly() {
		System.out.println("Can't fly");
	}

}
