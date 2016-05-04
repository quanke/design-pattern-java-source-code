public class Hub implements NetworkDevice
{
	private String type;
	
	public Hub(String type)
	{
		this.type=type;
	}
	
	public String getType()
	{
		return this.type;
	} 
	
	public void use(Port port)
	{
		System.out.println("Linked by Hub, type is " + this.type + ", port is " + port.getPort());
	}	
}