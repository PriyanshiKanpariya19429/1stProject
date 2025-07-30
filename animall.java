 class over {
    void voice()
    {
        System.out.println("meaw meaw");
    }
}
    class n1 extends over{
        void voice()
        {
            System.out.println("bhuu bhuu");
        }
    }
   public class animall{
    public static void main(String[] args)
    {
        n1 a1=new n1();
        a1.voice();
        over o1=new over();
        o1.voice();
        
    }
   } 
