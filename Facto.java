import java.util.Scanner;
public class Facto 
{
public static void main(String[] args) 
{
    Scanner sc=new Scanner(System.in);
    int fact=1;
    int n=sc.nextInt();
    int i;

    for(i=1;i<=n;i++)
    {
        fact=fact*i;

    
      System.out.println(fact + " ");
    }
}
}
