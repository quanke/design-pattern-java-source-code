public class Manager extends User
{
	public Manager()
	{
		System.out.println("创建经理对象！");
	}
	
	public void diffOperation()
	{
		System.out.println("经理拥有创建和审批假条权限！");
	}
}