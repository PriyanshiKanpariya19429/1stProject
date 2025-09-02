import java.util.Scanner;
public class spely
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
           if(str.equalsIgnoreCase(rev))
           {
            System.out.println("String is palidrome "+str);
           }
            else
            {
                System.out.println("String is not palidrome "+str);
            }
    }
}


    

