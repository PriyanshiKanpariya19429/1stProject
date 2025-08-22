public class co 
{
    static int count=0;
    void print()
    {
        count++;
        System.out.println("Object number : " +count);
    }
    public static void main(String[] args) 
    {
      co c1=new co();
       c1.print();
       c1.print();   
    }
    
}
