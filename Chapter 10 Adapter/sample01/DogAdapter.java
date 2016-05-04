public class DogAdapter extends Dog implements Robot
{
	public void cry()
	{
		System.out.print("机器人模仿：");
		super.wang();
	}
	
	public void move()
	{
		System.out.print("机器人模仿：");
		super.run();
	}
}