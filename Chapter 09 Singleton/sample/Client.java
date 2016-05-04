public class Client
{
	public static void main(String a[])
	{
	   Singleton s1=Singleton.getInstance();
       Singleton s2=Singleton.getInstance();
       System.out.println(s1==s2);
	}
}