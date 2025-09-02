import java.util.Scanner;
public class pely1 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        int origin=num;
        int rev=0;
        while(num>0)
        {
            int digit=num%10;
            rev=(rev*10)+digit;
            num=num/10;
        }
           if(origin==rev)
           {
            System.out.println("number is palidrome "+origin);
           }
            else
            {
                System.out.println("number is not palidrome "+origin);
            }
    }
}
