public class QuickSort implements Sort
{
	public int[] sort(int arr[])
	{
		System.out.println("¿ìËÙÅÅĞò");
		sort(arr,0,arr.length-1);
		return arr;
	}

	public void sort(int arr[],int p, int r)
	{
		int q=0;
		if(p<r)
		{
			q=partition(arr,p,r);
			sort(arr,p,q-1);
            sort(arr,q+1,r);
		}
	}
	
	public int partition(int[] a, int p, int r)
	{
		int x=a[r];
		int j=p-1;
		for(int i=p;i<=r-1;i++)
		{
			if(a[i]<=x)
			{
				j++;
				swap(a,j,i);
			}
		}
		swap(a,j+1,r);
		return j+1;	
	}
	
	public void swap(int[] a, int i, int j) 
	{   
        int t = a[i];   
        a[i] = a[j];   
        a[j] = t;   
	}
}