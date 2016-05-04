package dp.memento;

public class UserInfoDTO
{
	private String account;
	private String password;
	private String telNo;
	
	public String getAccount()
	{
		return account;
	}
	
	public void setAccount(String account)
	{
		this.account=account;
	}

	public String getPassword()
	{
		return password;
	}
	
	public void setPassword(String password)
	{
		this.password=password;
	}
	
	public String getTelNo()
	{
		return telNo;
	}
	
	public void setTelNo(String telNo)
	{
		this.telNo=telNo;
	}
		
	public Memento saveMemento()
	{
		return new Memento(account,password,telNo);
	}
	
	public void restoreMemento(Memento memento)
	{
		this.account=memento.getAccount();
		this.password=memento.getPassword();
		this.telNo=memento.getTelNo();
	}
	
	public void show()
	{
		System.out.println("Account:" + this.account);
		System.out.println("Password:" + this.password);
		System.out.println("TelNo:" + this.telNo);		
	}
}