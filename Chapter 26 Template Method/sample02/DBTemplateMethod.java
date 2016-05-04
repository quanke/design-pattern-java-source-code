abstract class DBOperator
{
	public abstract void connDB();
    public void openDB()
	{
		System.out.println("打开数据库");
	}
	public void useDB()
	{
		System.out.println("使用数据库");
	}
	public void closeDB()
	{
		System.out.println("关闭数据库");	
	}
   public void process()
   {
    connDB();
   	openDB();
   	useDB();
   	closeDB();
   }
} 

class DBOperatorSubA extends DBOperator
{
	public void connDB()
	{
		System.out.println("使用JDBC-ODBC桥接连接数据库");		
	}
}

class DBOperatorSubB extends DBOperator
{
	public void connDB()
	{
		System.out.println("使用连接池连接数据库");		
	}
}

class Client
{
	public static void main(String a[])
	{
		DBOperator db1;
		
		db1=new DBOperatorSubA();
		db1.process();
		System.out.println("---------------------------------------");			
		db1=new DBOperatorSubB();
		db1.process();
	}
}
