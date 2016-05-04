public class Apple implements Product
{
  public void accept(Visitor visitor)
  {
      visitor.visit(this);
  }	
}