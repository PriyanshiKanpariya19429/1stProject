import java.util.Scanner;
public class Sw 
{
   public static void main(String[] args) 
   {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int temp;
     System.out.println("Before swapping value of a = " +a);
     System.out.println("Before swapping value of b = " +b);
     temp=a;
     a=b;
     b=temp;
      System.out.println("After swapping value of a = " +a);
      System.out.println("After swapping value of b = " +b);
    
   } 
    
}
