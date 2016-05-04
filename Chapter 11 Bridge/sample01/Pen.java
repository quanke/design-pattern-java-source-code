public abstract class Pen
{
	protected Color color;
	public void setColor(Color color)
	{
		this.color=color;
	}
	public abstract void draw(String name);
} 