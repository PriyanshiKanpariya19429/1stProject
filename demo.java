public class demo 
{
    String name;
    int age;

    void sna(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    int gna()
    {
        System.out.println(name);
        System.out.println(age);
        return 0;
    }

    
    
        public static void main(String[] args) 
        {
          demo d1=new demo();
          d1.sna("abc",21);
          d1.gna(); 
        }   
        
    }
    

