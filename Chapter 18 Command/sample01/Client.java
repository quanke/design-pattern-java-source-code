public class Client
{
	public static void main(String a[])
	{
		AbstractCommand openCommand,closeCommand,changeCommand;
		
		openCommand = new TVOpenCommand();
		closeCommand = new TVCloseCommand();
		changeCommand = new TVChangeCommand();
		
		Controller control = new Controller(openCommand,closeCommand,changeCommand);
		
		control.open();
		control.change();
		control.close();
	}
}