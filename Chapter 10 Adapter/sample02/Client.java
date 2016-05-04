public class Client
{
	public static void main(String args[])
	{
		DataOperation dao=(DataOperation)XMLUtil.getBean();
		dao.setPassword("sunnyLiu");
		String ps=dao.getPassword();
		String es=dao.doEncrypt(6,ps);
		System.out.println("明文为：" + ps);
		System.out.println("密文为：" + es);
	}
}


