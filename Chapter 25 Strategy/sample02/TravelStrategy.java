interface TravelStrategy
{
	
	public void travelMethod();

}

class AirplaneStrategy implements  TravelStrategy
{	
	public void travelMethod()
	{
		System.out.println("飞机游！");
	}
}

class TrainStrategy implements  TravelStrategy
{
	public void travelMethod()
	{
		System.out.println("火车游！");
	}
}

class SelfTravelStrategy implements  TravelStrategy
{
	public void travelMethod()
	{
		System.out.println("自驾游！");
	}
}

class BicycleTravelStrategy implements  TravelStrategy
{
	public void travelMethod()
	{
		System.out.println("自行车游！");
	}
}

class MyContext
{
	private TravelStrategy ts;
	public MyContext(TravelStrategy ts)
	{
		this.ts=ts;
	}
	public void travelMethod()
	{
		ts.travelMethod();
	}
}

class Client
{
	public static void main(String args[])
	{
		MyContext mc=new MyContext((TravelStrategy)XMLUtil.getBean());
		mc.travelMethod();
	}
}
