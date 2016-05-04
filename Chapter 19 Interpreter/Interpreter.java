public abstract class AbstractExpression
{
	public abstract void interpret(Context ctx);
} 

public class TerminalExpression extends AbstractExpression
{
	public void interpret(Context ctx)
	{
		//对于终结符表达式的解释操作
	}
}

public class NonterminalExpression extends AbstractExpression
{
	private AbstractExpression left;
	private AbstractExpression right;
	
	public NonterminalExpression(AbstractExpression left,AbstractExpression right)
	{
		this.left=left;
		this.right=right;
	}
	
	public void interpret(Context ctx)
	{
		//递归调用每一个组成部分的interpret()方法
		//在递归调用时指定组成部分的连接方式，即非终结符的功能
	}	
}