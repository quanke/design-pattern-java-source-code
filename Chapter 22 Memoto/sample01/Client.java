import dp.memento.UserInfoDTO;
import dp.memento.Caretaker;

public class Client
{
	public static void main(String a[])
	{
	UserInfoDTO user=new UserInfoDTO();
	Caretaker c=new Caretaker();
	
	user.setAccount("zhangsan");
	user.setPassword("123456");
	user.setTelNo("13000000000");
	System.out.println("状态一：");
	user.show();
	c.setMemento(user.saveMemento());//保存备忘录
	System.out.println("---------------------------");

	user.setPassword("111111");
	user.setTelNo("13100001111");
	System.out.println("状态二：");	
	user.show();
	System.out.println("---------------------------");
		
	user.restoreMemento(c.getMemento());//从备忘录中恢复
	System.out.println("回到状态一：");
	user.show();
    System.out.println("---------------------------");
	}
}