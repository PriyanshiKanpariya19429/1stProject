import java.util.Scanner;
public class PN {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a > 0){
            System.out.println("Positive");
        }else{
            System.out.println("Negative");
        }
    }
    
}
