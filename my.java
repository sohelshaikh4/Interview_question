class my
{
	public static void main(String[] args) 
	{
		 int arr[]= {1,2,3,4,5};
		 int target=9;
		 sum(arr,target);
		 
		
	}

	private static void sum(int[] arr, int target) 
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length-1;j++)
			{
				if(arr[i]+arr[j]==target)
				{
					System.out.println("pair:"+arr[i]+ " "+arr[j]);
					return;
				}
			}
		}
		
	}
}