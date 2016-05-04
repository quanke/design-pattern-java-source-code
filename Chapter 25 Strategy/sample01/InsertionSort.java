public class InsertionSort implements Sort
{
	public int[] sort(int arr[])
	{
 	   int len=arr.length;
       for(int i=1;i<len;i++)
       {
           int j;
           int temp=arr[i];
           for(j=i;j>0;j--)
           {
              if(arr[j-1]>temp)
              {
                  arr[j]=arr[j-1];
                  
              }else
                  break;
           }
           arr[j]=temp;
		}
		System.out.println("≤Â»Î≈≈–Ú");
		return arr;
	}
}