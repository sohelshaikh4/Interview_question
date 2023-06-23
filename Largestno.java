import java.util.Scanner;
public class Largestno 
{
    public static void main(String a[])
    {
        int n,max,a,temp;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of elemente in array");
        n=sc.nextInt();
         a[]=new int[n];
        System.out.println("Enter number: ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        max=a[0];
        for(int i=0;i<n;i++)
        {
            max=a[i];
        }
        System.out.println("maximu no is:"+max);

    }
    
}
