public abstract class Handler
{
	protected Handler successor;
	
	public void setSuccessor(Handler successor)
	{
		this.successor=successor;
	}
	
	public abstract void handleRequest(String request);
}

public class ConcreteHandler extends Handler
{
	public void handleRequest(String request)
	{
		if(请求request满足条件)
		{
			......  //处理请求；
		}
		else
		{
			this.successor.handleRequest(request); //转发请求
		}
	}
}