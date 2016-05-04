public class FlyweightFactory
{
	private static HashMap flyweights = new HashMap();
	
	public static Flyweight getFlyweight(String key)
	{
		if(flyweights.containsKey(key))
		{
			return (Flyweight)flyweights.get(key);
		}
		else
		{
			Flyweight fw = new ConcreteFlyweight();
			flyweights.put(key,fw);
			return fw;
		}
	}
}

public class Flyweight
{
	private String intrinsicState;
	
	public Flyweight(String intrinsicState)
	{
		this.intrinsicState=intrinsicState;
	}
	
	public void operation(String extrinsicState)
	{
		......
	}	
}