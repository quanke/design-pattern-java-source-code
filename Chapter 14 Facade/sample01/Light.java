public class Light
{
	private String position;
	
	public Light(String position)
	{
		this.position=position;	
	}
	
	public void on()
	{
		System.out.println(this.position + "µÆ´ò¿ª£¡");
	}
	
	public void off()
	{
		System.out.println(this.position + "µÆ¹Ø±Õ£¡");	
	}
}