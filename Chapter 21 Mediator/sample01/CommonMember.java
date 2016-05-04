public class CommonMember extends Member
{
	public CommonMember(String name)
	{
		super(name);
	}
	
	public void sendText(String to,String message)
	{
	    System.out.println("普通会员发送信息：");
	    chatroom.sendText(name,to,message);  //发送
	}
	
	public void sendImage(String to,String image)
	{
		System.out.println("普通会员不能发送图片！");
	}
}