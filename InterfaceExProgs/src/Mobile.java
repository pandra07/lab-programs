
public class Mobile {
	Airtel airtel=new Airtel();
	Jio jio=new Jio();
	public Airtel getAirtel() {
		return airtel;
	}
	public void setAirtel(Airtel airtel) {
		this.airtel = airtel;
	}
	public Jio getJio() {
		return jio;
	}
	public void setJio(Jio jio) {
		this.jio = jio;
	}
	 void Airtel()
	{
		airtel.call();
		airtel.msg();
	}
	 void Jio()
	{
		jio.call();
		jio.msg();
	}

}
