import java.util.*;
public class Secondlargest 
{
    public static void main(String a[])
    {
     int n,temp;
     Scanner s = new Scanner(System.in);
     System.out.println("Enter the size:");
     n=s.nextInt();
     int a[]=new int[n];
     System.out.println("Enter the element") ;
     for(int i=0;i<n;i++)
     {
        a[i]=s.nextInt();
     }
     fot(int i=0;i<n;i++)
     {
        fot(j=i+1;j<n;j++)
        {
            if(a[i]>a[j])
            {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            
            }
        }
     }
     System.out.println("second largest element is :"a[1]);

    }
    
}
