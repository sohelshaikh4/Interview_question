/*
1.
*
**
***
****
*****

public class Pattern_Programs 
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
-------------------------------------------------------------------------------------------------------------------------------------------
*/

/*
//2.;
//*****
//****
//***
//**
//*
public class Pattern_Programs
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
				
		}
	}
}
-------------------------------------------------------------------------------------------------------------------------------------------

*/

/*
3.
*
**
***
****
*****
******
*******
********
*******
******
*****
****
***
**
*


public class Pattern_Programs
{
	public static void main(String args[])
	{
		for(int i=1;i<=8;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		for(int i=1;i<=8;i++)
		{
			for(int j=7;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
	}
}
-------------------------------------------------------------------------------------------------------------------------------------------

*/

/*
 4.
         *
        **
       ***
      ****
     *****
    ******
   *******
  ********
 *********
**********
 

class Pattern_Programs
{
	public static void main(String args[])
	{
		for(int i=1;i<=11;i++)
		{
			for(int j=10;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}

	}
}
-------------------------------------------------------------------------------------------------------------------------------------------

*/

/*
 5.
 ********
  *******
   ******
   	*****
   	 ****
   	  ***
   	   **
   	   	*
 

public class Pattern_Programs
{
	public static void main(String args[])
	{
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}	
			for(int k=10; k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}
-------------------------------------------------------------------------------------------------------------------------------------------

 */
/*
 *6.
  		*
       **
      ***
     ****
    *****  
   ******
    *****
     ****
      ***;
       **
       	*
 
public class Pattern_Programs
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");	
			}
			for(int k=4;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
-------------------------------------------------------------------------------------------------------------------------------------------

*/


/*
 *7. Pyramid Pattern
           *
         *   *
       *   *   *
     *   *   *   *
   *   *   *   *   *
        

class Pattern_Programs
{
	public static void main(String args[])
	{
		for(int i=1;i<=7;i++)
		{
			for(int j=7;j>=1;j--)
			{
				if(j>i)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("  *");
				}
			}
			System.out.println();
		}
	}
}
-------------------------------------------------------------------------------------------------------------------------------------------

 */


/*
 *8.Pyramid pattern
 		*
 	   ***
 	  *****
 	 *******
 	*********
   ***********
  *************

class Pattern_Programs
{
	public static void main(String args[])
	{
		for(int i=1;i<=7;i++)
		{
			for(int j=7;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<(i*2);k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
-------------------------------------------------------------------------------------------------------------------------------------------

 */



/*
 * 9.Invert Pyramid 
 *************
  ***********
   *********
   	*******
   	 *****
   	  ***
   	   *
 
class Pattern_Programs
{
	public static void main(String a[])
	{
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=13; k>(i*2);k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
-------------------------------------------------------------------------------------------------------------------------------------------

*/
/*
 
 /*
  
 10... 
  *
    *
      *
        *
          * 
  
class Pattern_Programs
{
	public static void main(String a[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i>=2 && j<=i-1)
				{
					System.out.print("  ");
				}
				else
				{
					System.out.print("  *");
				}
			}
			System.out.println();
		}
	}
}
-------------------------------------------------------------------------------------------------------------------------------------------

*/

/*
 11...
  				*
  			 *
  		  *
  		*
  	 *
   *
 *
 
 
class Pattern_Programs
{
	public static void main(String a[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++)
			{
				if(i>=2 && k>1)
				{
					System.out.print("");
				}
				else
				{
					System.out.print(" *");
				}
				
			}
			System.out.println();
		}
	}
}
------------------------------------------------------------------------------------------------------------
*/




/*
 12..pattern
 			*
 		  *   *
 		 *     *
 		*       *
 	   *         *
      *           *
     *             *
 	   
 	  
 
class Pattern_Programs
{
	public static void main(String a[])
	{
		for(int i=1;i<=7;i++)
		{
			for(int j=7;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<(i*2);k++)
			{
				if(k>1 && k<(i*2)-1)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
---------------------------------------------------------------------------------------------------------------------
*/



/*
 13.inverted pyramid
 
 *             *
  *           *
   *		 *
    *       *
     *     *
      *   *
       * *
        *
 

class Pattern_Programs
{
	public static void main(String a[])
	{
		for(int i=8;i>=1;i--)
		{
			for(int j=8;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<(i*2);k++)
			{
				if(k>1 && k<(i*2)-1)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();			
		}
	}
}
---------------------------------------------------------------------------------------------------------------------------
 */
/*
 14.box pattern
 
 ********
 ********
 ********
 ********
 ********
 ********
 ********


class Pattern_Programs
{
	public static void main(String a[])
	{
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<8;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
----------------------------------------------------------------------------------------------------------------------------
 */
/*
 * 15.cross pattern(MUliply)
 
  *		    *
   *       *
    *     *
     *   *
      * *
       *
      *	*
     *   *
    *     *
   *       * 
  *         *

          

class Pattern_Programs
{
	public static void main(String args[])
	{
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				if(i==j || i+j==10-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}
-------------------------------------------------------------------------------------------------------------------
*/
/*
 *16. Square Box outline Star pattern
 
  ********
  *      *   
  *      *
  *		 *
  *		 *
  ********
 

class Pattern_Programs
{
	public static void main(String a[])
	{
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=6;j++)
			{
				if(i>=2 && j>=2 && i<=5 && j<=5)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}
}
----------------------------------------------------------------------------------------------------------------
*/