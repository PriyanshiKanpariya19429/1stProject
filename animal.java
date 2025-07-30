public class animal {
    void voice()
    {
        System.out.println("bhee bhee");

    }
      int voice(int x)
      {
        System.out.println("bhauu bhauu");
        return 0;
      }
      public static void main(String[]args)
      {
        animal o1=new animal();
        o1.voice();
        System.out.println(o1.voice(1));
        

      }  
}
