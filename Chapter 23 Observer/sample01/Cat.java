public class Cat extends MySubject
{
	public void cry()
	{
		System.out.println("Ã¨½Ð£¡");
		System.out.println("----------------------------");		
		
		for(Object obs:observers)
		{
			((MyObserver)obs).response();
		}
		
	}	   	
}