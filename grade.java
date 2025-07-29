import java.util.Scanner;
public class grade {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of JAVA");
        int j=sc.nextInt();
        System.out.println("Enter the marks of DS");
        int D=sc.nextInt();
        System.out.println("Enter the marks of PHP");
        int P=sc.nextInt();
        float percentage=(j+D+P)/3;
        System.out.println(percentage);

        if(percentage>75){
            System.out.println("Distinction");
        }
        else if(percentage>60 && percentage<75){
            System.out.println("first class");
        }
        else if(percentage>35 && percentage<60){
            System.out.println("secound class");
    }
     else{
        System.out.println("fail");
     }  
}
}
