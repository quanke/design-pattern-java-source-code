public class Client
{
	public static void main(String args[])
	{
		NetworkDevice nd1,nd2,nd3,nd4,nd5;
		DeviceFactory df=new DeviceFactory();
		
		nd1=df.getNetworkDevice("cisco");
		nd1.use(new Port("1000"));
		
		nd2=df.getNetworkDevice("cisco");
		nd2.use(new Port("1001"));
		
		nd3=df.getNetworkDevice("cisco");
		nd3.use(new Port("1002"));
		
		nd4=df.getNetworkDevice("tp");
		nd4.use(new Port("1003"));
		
		nd5=df.getNetworkDevice("tp");
		nd5.use(new Port("1004"));
		
		System.out.println("Total Device:" + df.getTotalDevice());
		System.out.println("Total Terminal:" + df.getTotalTerminal());
	}
}