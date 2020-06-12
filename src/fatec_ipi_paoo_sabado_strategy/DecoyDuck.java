package fatec_ipi_paoo_sabado_strategy;

public class DecoyDuck extends Duck {

	@Override
	public void display() {
		System.out.println("Decoy Duck");
	}

	@Override
	public void fly() {
		System.out.println("Can't fly");
	}
}
