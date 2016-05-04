public class Saler extends Visitor
{
	public void visit(Apple apple)
	{
		System.out.println("收银员" + name + "给苹果过秤，然后计算其价格。");
	}
	
	public void visit(Book book)
	{
		System.out.println("收银员" + name + "直接计算书的价格。");
	}
}