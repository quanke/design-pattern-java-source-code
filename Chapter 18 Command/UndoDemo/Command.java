abstract class AbstractCommand
{
	public abstract int execute(int value);
	public abstract int undo();
}

class ConcreteCommand extends AbstractCommand
{
	private Adder adder = new Adder();
	private int value;
		
	public int execute(int value)
	{
		this.value=value;
		return adder.add(value);
	}
	
	public int undo()
	{
		return adder.add(-value);
	}
}

class CalculatorForm
{
	private AbstractCommand command;
	
	public void setCommand(AbstractCommand command)
	{
		this.command=command;
	}
	
	public void compute(int value)
	{
		int i = command.execute(value);
		System.out.println("执行运算，运算结果为：" + i);
	}
	
	public void undo()
	{
		int i = command.undo();
		System.out.println("执行撤销，运算结果为：" + i);
	}
}

class Adder
{
	private int num=0;
	
	public int add(int value)
	{
		num+=value;
		return num;
	}
}

class Client
{
	public static void main(String args[])
	{
		CalculatorForm form = new CalculatorForm();
		ConcreteCommand command = new ConcreteCommand();
		form.setCommand(command);
		
		form.compute(10);
		form.compute(5);
		form.compute(10);
		form.undo();
	}
}