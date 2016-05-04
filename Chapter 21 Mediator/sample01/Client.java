public class Client
{
	public static void main(String args[])
	{
		AbstractChatroom happyChat=new ChatGroup();
		Member member1,member2,member3,member4,member5;
		member1=new DiamondMember("张三");
		member2=new DiamondMember("李四");
		member3=new CommonMember("王五");
		member4=new CommonMember("小芳");
		member5=new CommonMember("小红");
		
		happyChat.register(member1);
		happyChat.register(member2);
		happyChat.register(member3);
		happyChat.register(member4);
		happyChat.register(member5);
		
		member1.sendText("李四","李四，你好！");
		member2.sendText("张三","张三，你好！");
		member1.sendText("李四","今天天气不错，有日！");
		member2.sendImage("张三","一个很大很大的太阳");
		member2.sendImage("张三","太阳");
		member3.sendText("小芳","还有问题吗？");
		member3.sendText("小红","还有问题吗？");
		member4.sendText("王五","没有了，谢谢！");
		member5.sendText("王五","我也没有了！");
		member5.sendImage("王五","谢谢");
	}
}