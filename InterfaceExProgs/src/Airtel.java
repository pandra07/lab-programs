
public class Airtel implements Sim{

	@Override
	public
	 void call() {
		
		System.out.println("Airtel sim calling");
	}

	@Override
	public
	void msg() {
		
		System.out.println("Airtel sim messaging");
	}

}
