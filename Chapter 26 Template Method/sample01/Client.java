public class Client
{
	public static void main(String a[])
	{
		BankTemplateMethod bank;
		bank=(BankTemplateMethod)XMLUtil.getBean();
		bank.process();
		System.out.println("---------------------------------------");
	}
}
