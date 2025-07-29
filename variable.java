public class variable {
    int a=10; //Instance Variable
    public static void main(String[] args) {
        int b=20; //Local Variable
        variable v1=new variable();
        System.out.println("value of a is "+v1.a);
        System.out.println("value of b  is "+b);
    }
}
