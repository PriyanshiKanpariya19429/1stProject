public class operators 
{
  public static void main(String[] args) {
    int a=10,b=20;
    int min=(a>b)?a:b;
    System.out.println("Arithmatic Operation:a+b="+(a+b));
    System.out.println("Relational Operation:a<=b="+(a<=b));
    System.out.println("Increment of a "+(a++));
    System.out.println("Decrement of b"+(a--));
    System.out.println("Assignment operator a="+(a+=2));
    System.out.println("Logical Operator of a and b="+(a>=10 && b>=10));
    System.out.println("Ternary operator of a and b:a>b="+(min));
  }  
    
    
}
