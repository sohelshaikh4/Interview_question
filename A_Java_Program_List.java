

/*
 ***********************************Java Program List*************************************************************************************


 * 1.Prime Number
		A number is divided by 1 and itself.
		0 and 1 is NOT Prime Number.
		2 is the only one Even Prime Number.
		eg.:2,3,5,7,11,13,17

import java.util.*;
public class A_Java_Program_List 
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int no=sc.nextInt();
		 
		int temp=0;
		for(int i=2;i<=no;i++)
		{
			if(no%i==0)
			{
				temp=temp+1;
			}
		}
		if(temp==0)
		{
			System.out.println(no + " is Prime number.");
		}
		else
		{
			System.out.println(no + " is NOT Prime Number.");
		}
	}
}
 
class A_Java_Program_List
{
	public static void main (String args[])
	{
		int temp=0;
		System.out.println("list of Prime No 1 to 100 are : ");
		for(int no=2; no<=100; no++)
		{
			for(int i=2; i<=no-1; i++)
			{
				if(no%i==0)
				{
					temp=temp+1;
				}
			}
			if(temp==0)
			{
				System.out.print(no+" ");
			}
			else
			{
				temp=0;
			}
		}
	}
}
=======================================================================================================================================================
*/

/*
 *2. Fibonacci Series in java
 		-next number is the previous of two sum number
 		-0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.

class A_Java_Program_List
{
	public static void main(String args[])
	{
		int a=0, b=1;
		System.out.print("*Fibonacci Series are : ");
		System.out.print(a+" "+b);
		
		int c;
		for(int i=1;i<=10;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}
}
================================================================================================================================================
 */


/*
 *3. Palindrome Number
 	 	-same number as after its reversing
 	 	-eg: 121 is a palindrome.
 
class A_Java_Program_List
{
	public static void main(String args[])
	{
		int no=121;
		int temp=no;
		int rev=0;
		int rem;
		
		while(temp!=0)
		{
			rem= temp%10;
			rev=rev*10+rem;
			temp= temp/10;
		}
		if(no==rev)
		{
			System.out.println(no+ " is a palindrome number");
		}
		else
		{
			System.out.println(no+ "  is NOT Palindrome number");
		}
	}
}
===================================================================================================================================================================
*/

/*
 	3. Palidrome String 
  

import java.util.*;
class A_Java_Program_List
{
	public static void main(String args[])
	{
		String org="namann";
		String rev="";
		
		int length=org.length();
		for(int i=length-1; i>=0; i--)
		{
			rev=rev+org.charAt(i);
		}
		
		if(org.equals(rev))
		{
			System.out.println(org+"=>String is Palindrome");
		}
		else
		{
			System.out.println(org+"=>String is NOT Palindrome");
		}
	}
}
===============================================================================================================================================================
 */
/*
 	4. Factorial Number 
 		-no is the product of all descending integer
 		-eg: 4!=4*3*2*1=24
 
import java.util.*;
class A_Java_Program_List
{
	public static void main(String a[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n= sc.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+n+" is "+fact);
	}
}
=================================================================================================================
*/


/*
 	5. Armstrong Number 
 		-no is equal to = sum of cube of each digit
 		-eg.153 = 1*1*1 + 5*5*5 + 3*3*3 
 				= 1 + 125 +27
 				= 153
 				" 153 is a ArmStrong Number"
 		
 		-Armstrong Number :0,1,2,3,4,5,7,8,9
 
import java.util.*;
class A_Java_Program_List
{
	public static void main(String args[])
	{
		int n, cube=0, num, r;
		Scanner sc= new Scanner(System.in);
		System.out.println("Ente the Number : ");
		n=sc.nextInt();
		num=n;
		
		while(num>0)
		{
			r=num%10;
			cube=cube+(r*r*r);
			num=num/10;
		}
		if(n==cube)
		{
			System.out.println(n+" is a Armstrong Number");
		}
		else
		{
			System.out.println(n+"is not Armstrong Number");
		}
	}
}
===========================================================================================================================================================================


/*
 	6. Print armstrong no between 1 to 1000
 		-Armstrong no: 1,153,370,371,407

class A_Java_Program_List
{
	public static void main(String args[])
	{
		int no,b, sum=0;
		System.out.println("Armstrong Numbers from 1 to 1000 are : ");
		for(int i=1;i<=1000;i++)
		{
			no=i;
			while(no>0)
			{
				b=no%10;
				sum=sum+(b*b*b);
				no=no/10;
			}
			if(sum==i)
			{
				System.out.print(i+" ");
			}
			else
			{
				sum=0;
			}
		}
	}
}
=========================================================================================================================================================================================
*/

/*
 	7. Reverse Number
 	
 
class A_Java_Program_List
{
	public static void main(String args[])
	{
		int num=12345;
		int rev=0;
		int rem;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("Orignal Number is : "+num);
		System.out.println("Reversed No is: "+rev);
	}
}
======================================================================================================================================                              
*/

/*
 	8. Reverse String	 
 		

class A_Java_Program_List
{
	public static void main(String args[])
	{
		String org="seenu";
		String rev=" ";
		int len=org.length();
		for(int i=len-1; i>=0; i--)
		{
			rev=rev+org.charAt(i);
		}
		System.out.println("Orignal String is :"+org);
		System.out.println("Reversed String is :"+rev);		
	}
}
========================================================================================================================================================================================================
 */	

/*
 	9. Swap of two number:
 	
 		-a.Using Third Variable

 class A_Java_Program_List
 {
	 public static void main(String args[])
	 {
		 int a=10,b=40,temp;
		 System.out.println("Before Swapping values are : "+a+" "+b);
		 	temp=a;
		 	a=b;
		 	b=temp;
		 System.out.println("After Swapping values are :"+a+" "+b);
	 }
 }

// b. Without Using Third Variable
import java.util.*;
 class A_Java_Program_List
 {
	 public static void main(String args[])
	 {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Swapping two no without using Third variable");
		 System.out.println("Enter the value of a and b: ");
		 int a=sc.nextInt();
		 int b=sc.nextInt();
		 System.out.println("before swapping values are : "+a+" "+b);
		 	a=a+b;
		 	b=a-b;
		 	a=a-b;
		 System.out.println("After swapping values are : "+a+" "+b);
		 	
	 }
 }
=========================================================================================================================================================================================
 */

/*
 	10. Count number of digit in a number
 
class A_Java_Program_List
{
	public static void main(String args[])
	{
		int num=12345;
		int count = 0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println("Number of Digit : "+count);
	}
}
===============================================================================================================================================================================
*/

/*
  	11.Count the number of Even and Odd.

class A_Java_Program_List
{
	public static void main(String args[])
	{
		int num=453192;
		int even_count=0;
		int odd_count = 0;
		int rem;
		
		while(num>0)
		{
			rem=num%10;
			if(rem%2==0)
			{
				even_count++;
			}
			else
			{
				odd_count++;
			}
			num=num/10;
		}
		System.out.println("Number Of Even Number are:"+even_count);
		System.out.println("Number Of ODD Numbers are :"+odd_count);
	}
}
=======================================================================================================================================================================================
 */

/*
 		12.Count sum of digit in a number

class A_Java_Program_List
{
	public static void main(String args[])
	{
		int num=123455677;
		int sum=0;
		while(num>0)
		{
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println("Sum of digit in a number is :"+sum);
	}
}    
======================================================================================================================================================================================================

  */


/*
 		13. Find the largest number

import java.util.*;
 class A_Java_Program_List
 {
	 public static void main(String args[])
	 {
		 int a,b,c;
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter The first Number :");
		 a=sc.nextInt();
		 System.out.println("Enter the Second Number: ");
		 b=sc.nextInt();
		 System.out.println("Enter the Third Number : ");
		 c=sc.nextInt();
		 
		 
		 //logic:1  
		 if(a>b && a>c)
		 {
			 System.out.println(a+ " is the largest number");
		 }
		 else if(b>a && b>c)
		 {
			 System.out.println(b+ " is the largest number");
		 }
		 else
		 {
			 System.out.println(c+" is the largest number");
		 }	
		 
		 //logic 2: Ternary Operator
		 int larg1= a>b ? a:b;
		 int larg2=	c>larg1 ? c:larg1;
		 
		 int larger= larg2;
		 System.out.println(larg2+" is the largest number");
	 }	 
 }
=====================================================================================================================================================================









  */
/*
 ***************************---Arrays Program------*********************************
 *
 		14.find sum of element of array
 		

 class A_Java_Program_List
 {
	 public static void main(String args[])
	 {
		 int a[]= {54,6,3,7,3,74,8,2};
		 int sum=0;
		 for(int i=0; i<a.length-1; i++)
		 {
			 sum=sum+a[i];
		 }
		 System.out.println("Sum of an element of array is :" +sum);
		 
		 
		 
		 
		 //Logic 2: foreach loop
		 for(int my:a)
		 {
			 sum=sum+my;
		 }
		 System.out.println("Sum of an element of array is :" +sum);
	 }
 }
 ================================================================================================================================================================================
  */

/*
 		15. Print EVEN & ODD in array
 
class A_Java_Program_List
{
	public static void main(String args[])
	{
		int a[]= {1,2,3,4,5,6,7,8,9,0,10};
		
		//logic 1.:
		System.out.println("Even number In Array:");
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2 == 0)
			{
				System.out.println(a[i]);	
			}			
		}
		System.out.println("ODD number In Array:");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2 !=0)
			{
				System.out.println(a[i]);
				
			}
		}	
		
		
		
		//logic 2: enhanced for loop
		System.out.println("Even No:");
		for(int my:a)
		{
			if(my%2==0)
			{
				System.out.println(my);
			}
		}
		System.out.println("Odd no:");
		for(int my:a)
		{
			if(my%2!=0)
			{
				System.out.println(my);
			}
		}
					
	}
}

====================================================================================================================================

*/
/*
  	16. Check  Two array equal of Not
  	
  	
 class A_Java_Program_List
{
	public static void main(String args[])
	{
		int[] a1= {1,2,3,4,5,6,7};
		int[] a2= {2,3,4,5,6,7};
		
		//Logic 1: Equals method
		boolean result= Arrays.equals(a1, a2);
		if(result==true)
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}
		
		
		//logic 2: without equals method
		boolean result= true;
		if(a1.length==a2.length)
		{
			for(int i=0 ;i<a1.length;i++)
			{
				if(a1[i]!=a2[i])
				{
					result =false;
				}
			}
		}
		else
		{
			result = false;
			
		}
		if(result=true)
		{
			System.out.println("array are equal");
		}
		else
		{
			System.out.println("arrays are not equal");
		}
	
	}
}  
============================================================================================================================================
*/


/*
 		17. Missing Number in array. 
 		

class A_Java_Program_List
{
	public static void main(String args[])
	{
		int a[]= {1,3,4,5,6};
		
		int sum1=0;
		for(int i=0;i<a.length;i++)
		{
			sum1=sum1+a[i];
		}
		System.out.println("sum of element in array: "+sum1);
		
		int sum2=0;
		for(int i=1;i<=6;i++)
		{
			sum2=sum2+i;
		}
		System.out.println("sum of range element in array: "+sum2);
		
		System.out.println("Missing element in array:"+(sum2-sum1));
		 
	}
}
===========================================================================================================================================================================================================================
 */

/*
 		18. Maximum and Minimum element in array;
 
class A_Java_Program_List
{
	public static void main(String args[])
	{
		int a[]= {12,34,65,76,24,65};
		
		int max=a[0];	
		for(int i=1;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("Maximum element in array: "+max);
		
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println("Minimum element in array :"+min);
	}
}
=============================================================================================================================================================================================
*/

/*

  	19.Duplicate element in array
*/
import java.util.Set;
import java.util.*;

class A_Java_Program_List
{
	public static void main(String args[])
	{
		int []a= {3,4,5,6,7,3,4};
		
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
	



	
		//Logic 2: By using Set Interface
		System.out.println("Logic 2: By using Set Interface");
		System.out.println("Duplicate Element in array are :");
		Set<Integer> s= new HashSet<>();
		for(int num : a)
		{
			boolean b= s.add(num);
			if(b==false)
			{
				System.out.print(num+",");
			}
		}
		
		
		//logic 3:by usinG Hashtable   
		
		 Map<Integer,Integer> hm= new HashMap<>();
		 for(int no:a)
		 {
			Integer count= hm.get(no);
			if(count==null)
			{
				hm.put(no, 1);
			}
			else
			{
				count=count+1;
				hm.put(no, count);
			}
		 }
			System.out.print("Duplicate Elements are :");
			Set<Map.Entry<Integer, Integer>> es = hm.entrySet();
			for(Map.Entry<Integer, Integer> me:es)
			{
				if(me.getValue()>1)
				{
					System.out.print(me.getKey()+" ");
				}
				
			}
	}
}

	



/*

 		//20.find common element from two array

import java.util.*;
import java.util.HashSet;
class A_Java_Program_List
{
	public static void main(String a[])
	{
		int[] arr1= {2,4,6,8,9,4,4};
		int[] arr2= {3,4,7,8,1,6,6,6};
		
		//logic 1:
		System.out.println("Common Element in array are :");
		for(int i=0;i<arr1.length; i++)
		{
			for(int j=0 ;j<arr2.length; j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.print(arr2[j]+" ,");		
				}
			} 
		}
		//logic 2:
		
		HashSet<Integer> hs= new HashSet<>(d);
		System.out.println("Using Hashset: ");
		for(int i=0 ;i<arr1.length; i++)
		{
			for(int j=0; j<arr2.length; j++)
			{
				if(arr1[i]==arr2[j])
				{
					hs.add(arr1[i]);
					
				}
			}
		}
		for(int num:hs)
		{
			System.out.print(num+" ,");
		}
	}
}

/*
class A_Java_Program_List
{
	public static void main(String[] args) {
		
		String s = "hello";
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
		*/
	
	}
}
*/
