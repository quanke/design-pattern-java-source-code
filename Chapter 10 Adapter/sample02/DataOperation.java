public abstract class DataOperation
{
	private String password;
	
	public void setPassword(String password)
	{
		this.password=password;
	}
		
	public String getPassword()
	{
		return this.password;
	}
	
	public abstract String doEncrypt(int key,String ps);
}