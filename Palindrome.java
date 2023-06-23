public class Palindrome 
{
    public static void main(String a[])
    {
       int rev, sum=0,temp;
       int num=344;
         temp=num;
        while(num>0)
        {
            rev=num%10;
            sum=(sum*10)+rev;
            num=num/10;
        }
        if(temp==num)
        System.out.println(temp+"  is palindrom");
        else
        System.out.println(temp+" is NOT palindrome");
    }
}

