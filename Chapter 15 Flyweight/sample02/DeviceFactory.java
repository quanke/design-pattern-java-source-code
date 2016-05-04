import java.util.*;

public class DeviceFactory
{
	private ArrayList devices = new ArrayList();
	private int totalTerminal=0;
	
	public DeviceFactory()
	{
		NetworkDevice nd1=new Switch("Cisco-WS-C2950-24");
		devices.add(nd1);
		NetworkDevice nd2=new Hub("TP-LINK-HF8M");
		devices.add(nd2);
	}
	
	public NetworkDevice getNetworkDevice(String type)
	{
		if(type.equalsIgnoreCase("cisco"))
		{
			totalTerminal++;
			return (NetworkDevice)devices.get(0);
		}
		else if(type.equalsIgnoreCase("tp"))
		{
			totalTerminal++;
			return (NetworkDevice)devices.get(1);
		}
		else
		{
			return null;
		}
	}
	
	public int getTotalDevice()
	{
		return devices.size();
	}
	
	public int getTotalTerminal()
	{
		return totalTerminal;
	}
}