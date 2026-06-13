public class TypeCasting2 {
    public static void main(String[] args) {
        System.out.println(12);//Integer Literal is by default int
        System.out.println(12.6);//Floating Point Literal is by default double
        //float =2.5;//error
        float a=(float)2.5;
        float b=2.5f; //can be -> 2.5F
        System.out.println(a);
        System.out.println(b);

        double x=2.5;
        double y=2.5d; //can be -> 2.5D
        System.out.println(x);
        System.out.println(y);

        //long z=100;//allowed
//        long z=(long)10000000000; //error
//        long z=10000000000; //error
        long z=10000000000L;
        System.out.println(z);
    }
}