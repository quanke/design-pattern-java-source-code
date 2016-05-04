public abstract class HookDemo
{
	public abstract void getData();
	
    public void convertData()
	{
		System.out.println("通用的数据转换操作。");
	}
	
	public abstract void displayData();

    public void process()
    {
        getData();
        if(isValid())
        {
            convertData();	
        }
   	    displayData();
    }
    
    public boolean isValid()
    {
    	return true;
    }
} 

class SubHookDemo extends HookDemo
{
	public void getData()
	{
		System.out.println("从XML配置文件中获取数据。");
	}
	
	public void displayData()
	{
		System.out.println("以柱状图显示数据。");
	}
	
	public boolean isValid()
    {
    	return false;
    }	
}

class Client
{
	public static void main(String a[])
	{
		HookDemo hd;
		
		hd=new SubHookDemo();
		hd.process();
	}
}
