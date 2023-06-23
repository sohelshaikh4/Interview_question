/*
*********************String Related Programss******************************************
*/

/*
 		1
 */
class A_Java_String
{
	public static void main(String args[])
	{
		int []a= {3,4,5,6,7,3,4,4};
		
		//Logic 1: Brute Force 
		System.out.println("Logic 1: Brute Force");
		System.out.println("Duplicate Element in array are :");
		for(int i=0; i<a.length-1; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if((a[i]== a[j]) && (i!=j))
				{
					System.out.print(a[j]+",");
				}
			}
		}
	}
}