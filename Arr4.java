import java.util.Scanner;
public class Arr4 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int size,sum=0;
        System.out.println("Enter the size of array");
        size=sc.nextInt();
        int[]a=new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter the value:");
            a[i]=sc.nextInt();
            sum+=a[i];
        }
          System.out.println("\nYou entered:");
          for(int i=0;i<size;i++)
          {
            System.out.println(a[i]);
          }
          System.out.println("\n addition of elements:"+sum);        
    }
}
