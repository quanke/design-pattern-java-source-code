public class TCLTelevision implements Television
{
	private Object[] obj={"湖南卫视","北京卫视","上海卫视","湖北卫视","黑龙江卫视"};
	public TVIterator createIterator()
	{
		return new TCLIterator();
	}
   
	class TCLIterator implements TVIterator
	{
	   	private int currentIndex=0;
	   	 	
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
		
		public void setChannel(int i)
		{
			currentIndex=i;
		}
		
		
		public Object currentChannel()
		{
			return obj[currentIndex];
		}
		
		public boolean isLast()
		{
			return currentIndex==obj.length;
		}
	
		public boolean isFirst()
		{
			return currentIndex==0;
		}
	}
}