public class co1 
{
    static int count=0;
    void print()
    {
        count++;
    }
    public static void main(String[] args) 
    {
        co1 c1=new co1();
        c1.print();
        c1.print();
        c1.print();
        System.out.println("Object number : " +count);
        
    }
    
}
