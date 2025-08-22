import java.util.Arrays;
import java.util.Collections;
public class Desend 
{
    public static void main(String[] args) 
    {
      String[]a={"zero","Mango","Chery"};
      Arrays.sort(a,Collections.reverseOrder());
      for(int i=0;i<4;i++)
      {
        System.out.println(a[i]);
      }  
        
    }
    
}
