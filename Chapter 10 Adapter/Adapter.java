public class Adapter extends Target
{
	private Adaptee adaptee;
	
	public Adapter(Adaptee adaptee)
	{
		this.adaptee=adaptee;
	}
	
	public void request()
	{
		adaptee.specificRequest();
	}
}