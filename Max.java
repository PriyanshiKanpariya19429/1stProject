import java.util.Scanner;
public class Max
{
   public static void main(String[] args) 
   {
     Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();

    if(a>b && a>c)
    {
        System.out.println("Maximum value is = " +a);
    }
    else if(b>a && b>c)
    {
        System.out.println("Maximum value is = " +b);
    }
    else
    {
        System.out.println("Maximum value is = " +c);
    }
    
   } 
    
}
