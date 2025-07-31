public class TK {
    int a,b;
    void set(int a,int b)
    {
     this.a=a;
     this.b=b;
    }
    void get()
    {
        System.out.println(a);
        System.out.println(b);
    }   
        public static void main(String[]args)
        {
        TK t1=new TK();
        t1.set (10,20);
        t1.get();
        }
    }


    

