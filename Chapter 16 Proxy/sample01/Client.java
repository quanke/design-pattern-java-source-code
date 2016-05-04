public class Client
{
	public static void main(String args[])
	{
		AbstractPermission permission;
		permission=(AbstractPermission)XMLUtil.getBean();

		permission.modifyUserInfo();
		permission.viewNote();
		permission.publishNote();
		permission.modifyNote();
		System.out.println("----------------------------");
		permission.setLevel(1);
		permission.modifyUserInfo();
		permission.viewNote();
		permission.publishNote();
		permission.modifyNote();
	} 
}