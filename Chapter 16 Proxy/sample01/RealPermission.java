public class RealPermission implements AbstractPermission
{	
	public void modifyUserInfo()
	{
		System.out.println("修改用户信息！");
	}

	public void viewNote()
	{   }
	
	public void publishNote()
	{
		System.out.println("发布新帖！");
	}
	
	public void modifyNote()
	{
		System.out.println("修改发帖内容！");
	}
	
	public void setLevel(int level)
	{	}
}