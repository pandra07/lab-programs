
public class Person {
	public static void main(String args[])
	{
		Mobile m=new Mobile();
		Airtel airtelsim=new Airtel();
		m.setAirtel(airtelsim);
		Jio jiosim=new Jio();
		m.setJio(jiosim);
		
		m.Airtel();
		System.out.println("............");
		m.Jio();
		
		
		//System.out.println("............");
		//Sim airtel=new Airtel();
		//Sim jio=new Jio();
		//airtel.call();
		//airtel.msg();
		//jio.call();
		//jio.msg();
		
		


	}

}
