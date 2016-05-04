public class HaierFactory implements EFactory
{
	public Television produceTelevision()
	{
		return new HaierTelevision();
	}
	
	public AirConditioner produceAirConditioner()
	{
		return new HairAirConditioner();
	}
}