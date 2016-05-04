public class BubbleSort implements Sort
{
	public int[] sort(int arr[])
	{
	   int len=arr.length;
       for(int i=0;i<len;i++)
       {
           for(int j=i+1;j<len;j++)
           {
              int temp;
              if(arr[i]>arr[j])
              {
                  temp=arr[j];
                  arr[j]=arr[i];
                  arr[i]=temp;
              }             
           }
		}
		System.out.println("ц╟ещеепР");
		return arr;
	}
}