public class SkyworthTelevision implements Television
{
	private Object[] obj={"CCTV-1","CCTV-2","CCTV-3","CCTV-4","CCTV-5","CCTV-6","CCTV-7","CCTV-8"};
	public TVIterator createIterator()
	{
		return new SkyworthIterator();
	}

	private class SkyworthIterator implements TVIterator
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