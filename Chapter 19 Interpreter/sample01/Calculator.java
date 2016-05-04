import java.util.*;

public class Calculator
{
	private String statement;
	private Node node;
    
    public void build(String statement)
    {
    	Node left=null,right=null;
    	Stack stack=new Stack();
    	
    	String[] statementArr=statement.split(" ");
    	
    	for(int i=0;i<statementArr.length;i++)
    	{	
    		if(statementArr[i].equalsIgnoreCase("*"))
    		{
    			left=(Node)stack.pop();
    		    int val=Integer.parseInt(statementArr[++i]);
    		    right=new ValueNode(val); 
    			stack.push(new MulNode(left,right));
    		}
    		else if(statementArr[i].equalsIgnoreCase("/"))
    		{
    			left=(Node)stack.pop();
    		    int val=Integer.parseInt(statementArr[++i]);
    		    right=new ValueNode(val); 
    			stack.push(new DivNode(left,right));    			
    		}
    		else if(statementArr[i].equalsIgnoreCase("%"))
    		{
    			left=(Node)stack.pop();
    		    int val=Integer.parseInt(statementArr[++i]);
    		    right=new ValueNode(val); 
    			stack.push(new ModNode(left,right));   			
    		}
    		else
    		{
    			stack.push(new ValueNode(Integer.parseInt(statementArr[i])));
    		}
    	}
    	this.node=(Node)stack.pop();
    }
	
	public int compute()
	{
		return node.interpret();
	}
}