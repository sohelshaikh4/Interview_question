/*
 *1.
     1
     12
     123
     1234
     12344
 

public class Pattern_Numbers 
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
---------------------------------------------------------------------------------------------------------------------------
 */

/*
 *2.
 *
 	 1
 	 22
 	 333
 	 4444
 	 55555


class Pattern_Numbers
{
	public static void main(String a[])
	{
		int count=0;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				count=count+1;
				System.out.print(count);
			}
			System.out.println();
		}
	}
}
-----------------------------------------------------------------------------------------------------------------
 */
/*
 4.
 
 	1
 	21
 	321
 	4321
 	54321

class Pattern_Numbers
{
	public static void main(String a[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
-----------------------------------------------------------------------------------------------------------------
 */
/*
 * 5.
 		1
 		121
 		12321
 		1234321
 		123454321
 
class Pattern_Numbers
{
	public static void main(String a[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(int k=i-1;k>=1;k--)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}
}
==============================================================================================================
*/
/*
 *6. Reverse
 		
 		54321
 		5432
 		543
 		54
 		4
 		

class Pattern_Numbers
{
	public static void main(String a[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
=============================================================================================================
 */

/*
 *7.column wise no print 1 to 15 right angle triangle
 			
 			1
 			2 6
 			3 7 10
 			4 8 11 13
 			5 9 12 14 15
 
class Pattern_Numbers
{
	public static void main(String a[])
	{
		for(int i=1;i<=5;i++)
		{
			int no=i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(no+" ");
				no=no+(5-j);
			}
			System.out.println();
		}
	}
}
===========================================================================================================================
*/

/*
 * 8.pyramid
 			
 			1
 	      2   2
 	    3   3   3
 	  4   4   4     4

class Pattern_Numbers
{
	public static void main(String a[])
	{
		for(int i=1;i<=8;i++)
		{
			for(int j=8;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}
}
=====================================================================================================================
*/
/*
 * 9.
 		1
  	   1 2
  	  1 2 3
  	 1 2 3 4
  	1 2 3 4 5
  	

class Pattern_Numbers
{
	public static void main(String a[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}
}
======================================================================================================================
 */


/*
 	10. pyramid pattern 12345678910
 				1
 			   2 3
 			  4 5 6
 			 7 8 9 10
 			11 12 13 14 
 			  			   

class Pattern_Numbers
{
	public static void main(String a[])
	{
		int count=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++,count++)
			{
				System.out.print(count+" ");
			}
			System.out.println();
			
		}
	}
}
==========================================================================================================================================
 */


