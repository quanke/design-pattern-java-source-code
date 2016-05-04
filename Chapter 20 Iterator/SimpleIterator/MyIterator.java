interface MyCollection
{
	MyIterator createIterator();
}
interface MyIterator
{
	void first();
	void next();
	boolean isLast();
	Object currentItem();
}

class NewCollection implements MyCollection
{
   private Object[] obj={"dog","pig","cat","monkey","pig"};
   public MyIterator createIterator()
   {
  	  return new NewIterator();
   }
   
   private class NewIterator implements MyIterator
   {
   	private int currentIndex=0;
   	
   	public void first()
   	{
   	  	currentIndex=0;
   	}
   	
	public void next()
	{
		if(currentIndex<obj.length)
		{
			currentIndex++;
		}
	}
	
	public void previous()
	{
		if(currentIndex>0)
		{
			currentIndex--;
		}
	}	
	
	public boolean isLast()
	{
		return currentIndex==obj.length;
	}
	
	public boolean isFirst()
	{
		return currentIndex==0;
	}
	
	public Object currentItem()
	{
		return obj[currentIndex];
	}
	
   }
}

class Client
{
	public static void process(MyCollection collection)
	{
		MyIterator i=collection.createIterator();
		
		while(!i.isLast())
		{
			System.out.println(i.currentItem().toString());
			i.next();
		}
	}
	
	public static void main(String a[])
	{
		MyCollection collection=new NewCollection();
		process(collection);
	}
}
