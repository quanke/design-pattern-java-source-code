public class ForumAccount
{
	private AbstractState state;
	private String name;
	public ForumAccount(String name)
	{
		this.name=name;
		this.state=new PrimaryState(this);
		System.out.println(this.name + "×¢²á³É¹¦£¡");	
		System.out.println("---------------------------------------------");	
	}
	
	public void setState(AbstractState state)
	{
		this.state=state;
	}
	
	public AbstractState getState()
	{
		return this.state;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
    public void downloadFile(int score)
    {	
		state.downloadFile(score);
    }
    
	public void writeNote(int score)
	{
		state.writeNote(score);
	}
	
	public void replyNote(int score)
	{
		state.replyNote(score);
	}
}