import java.util.*;

public class ChatGroup extends AbstractChatroom
{
	private Hashtable members=new Hashtable();
	
	public void register(Member member)
	{
		if(!members.contains(member))
		{
			members.put(member.getName(),member);
			member.setChatroom(this);
		}
	}
	
   public void sendText(String from,String to,String message)
   {
   	  Member member=(Member)members.get(to);
   	  String newMessage=message;
   	  newMessage=message.replaceAll("日","*");
	  member.receiveText(from,newMessage);
   }
   
   public void sendImage(String from,String to,String image)
   {
   	  Member member=(Member)members.get(to);
   	  //模拟图片大小判断
   	  if(image.length()>5)
   	  {
   	  	  System.out.println("图片太大，发送失败！");
   	  }
   	  else
   	  {
   	  	  member.receiveImage(from,image);
   	  }
   }
}