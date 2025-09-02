 class A 
{
    static int x;
}
class B extends A
{
void dip(int x)
{
    A.x=x;
    System.out.println(x);
}
}
public class hidden
{
    public static void main(String[] args) 
    {
        B obj=new B();
        obj.dip(10);
        
    }
}

