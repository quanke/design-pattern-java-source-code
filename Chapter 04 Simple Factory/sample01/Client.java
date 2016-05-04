public class Client
{
	public static void main(String args[])
	{
         try
         {
         	TV tv;
         	String brandName=XMLUtilTV.getBrandName();
         	tv=TVFactory.produceTV(brandName);
         	tv.play();
         }
         catch(Exception e)
         {
         	System.out.println(e.getMessage());
         }
	}
}
