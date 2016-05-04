public class Client
{
	public static void main(String args[])
	{
		GeneralSwitchFacade gsf=new GeneralSwitchFacade();
		gsf.on();
		System.out.println("-----------------------");	
		gsf.off();
	}
}