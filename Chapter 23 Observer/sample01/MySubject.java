import java.util.*;

public abstract class MySubject
{
	protected ArrayList observers = new ArrayList();
	
	//注册方法
	public void attach(MyObserver observer)
	{
		observers.add(observer);
	} 
	
	//注销方法
	public void detach(MyObserver observer)
	{
		observers.remove(observer);
	}
	
	public abstract void cry(); //抽象通知方法
}