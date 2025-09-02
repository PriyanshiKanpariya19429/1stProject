 class sim 
{
  static int a=10,b=20,c;
  static void print()
  {
    c=a+b;
    System.out.println(c);
  }
    static void name1(String name)
    {
        System.out.println(name);
    }
}
 public class C extends sim
 {
    public static void main(String[] args) 
    {
        print();
        name1("Priyanshi");
    }
 }     
