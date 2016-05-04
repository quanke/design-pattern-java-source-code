public class Decorator extends Component
{
	private Component component;
	
	public Decorator(Component component)
	{
		this.component=component;
	}
	
	public void operation()
	{
		component.operation();
	}
}

public class ConcreteDecorator extends Decorator
{
	public ConcreteDecorator(Component component)
	{
		super(component);
	}
	
	public void operation()
	{
		super.operation();
		addedBehavior();
	}
	
	public void addedBehavior()
	{
		
	}
}