public class TypeCasting1 {
    public static void main(String[] args) {
        int a=12;
        double b=a; //Implicit Typecasting or Upcasting or Widening
        System.out.println(a);
        System.out.println(b);

        double x=12.6;
        //int y=x; //error
        int y=(int)x; //Explicit Typecasting or Downcasting or Narrowing
        System.out.println(x);
        System.out.println(y);
    }
}
