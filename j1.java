import java.util.Scanner;
public class j1 
{
   public static void main(String[] args) 
   {
    Scanner sc=new Scanner(System.in);
    int jag[][]=new int[2][];
    System.out.println("Enter elements of 1st Row");
    int a=sc.nextInt();
    jag[0]=new int[a];
    System.out.println("Enter elements numbers");
    for(int i=0;i<a;i++)
    {
        jag[0][i]=sc.nextInt();
    }

     System.out.println("Enter elements of 2nd Row");
     int b=sc.nextInt();
     jag[1]=new int[b];
     System.out.println("Enter elements numbers");
     for(int i=0;i<b;i++)
     {
        jag[1][i]=sc.nextInt();
     } 
      for(int i=0;i<jag.length;i++)
      {
        for(int j=0;j<jag[i].length;j++)
        {
            System.out.print(jag[i][j]+" ");
        }
           System.out.println();
      }
    
   } 
    
}
