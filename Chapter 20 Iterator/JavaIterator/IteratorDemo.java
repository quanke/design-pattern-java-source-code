import java.util.*;

public class IteratorDemo
{	
   public static void process(Collection c)
   {
   	  	Iterator i=c.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next().toString());
		}
   }

	public static void main(String args[])
	{
		Collection list=new HashSet();
		list.add("Cat");
		list.add("Dog");
		list.add("Pig");
		list.add("Dog");
		list.add("Monkey");
		
		process(list);
	}
}