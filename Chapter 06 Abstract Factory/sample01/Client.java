public class Client
{
	public static void main(String args[])
	{
         try
         {
         	EFactory factory;
         	Television tv;
         	AirConditioner ac;
         	factory=(EFactory)XMLUtil.getBean();
         	tv=factory.produceTelevision();
         	tv.play();
         	ac=factory.produceAirConditioner();
         	ac.changeTemperature();
         }
         catch(Exception e)
         {
         	System.out.println(e.getMessage());
         }
	}
}
