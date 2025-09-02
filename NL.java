import java.util.Scanner;
public class NL 
{
   public static void main(String[]args)
   {
    
     String[]a={"Zero","One","Two","Three","Four","Five"};
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter number(0-5)");
     int num=sc.nextInt();
     
     if(num>=0 && num<=5)
     {
        System.out.println("In words:"+a[num]);
     }
       else
       {
        System.out.println("Please enter number between 0 and 5");
       }
    }
    
}
