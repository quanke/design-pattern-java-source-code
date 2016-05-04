public class Administrator extends User
{
	public Administrator()
	{
		System.out.println("创建管理员对象！");
	}
	
	public void diffOperation()
	{
		System.out.println("管理员拥有创建和管理假条权限！");
	}
}