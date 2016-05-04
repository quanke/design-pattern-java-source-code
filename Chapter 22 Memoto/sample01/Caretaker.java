package dp.memento;

public class Caretaker
{
	private Memento memento;
	public Memento getMemento()
	{
		return memento;
	}
	public void setMemento(Memento memento)
	{
		this.memento=memento;
	}
}