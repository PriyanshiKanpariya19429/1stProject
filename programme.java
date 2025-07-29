public class programme
{
  int add(int a,int b)
{
  int c=a+b;
  System.out.println(c);
  return 0;
}
void sub()
{
   int a=5,b=1,c;
   c=a-b;
   System.out.println(c);
}
public static void main(String[]args)
{
  programme d1=new programme();
  d1.add(10,20);
  d1.sub();
}
}
    
