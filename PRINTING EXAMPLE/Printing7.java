public class Printing7 {
    public static void main(String[] args) {
		int a=10,b=5;
		//Values are 10,5
        System.out.println("Values are "+a+","+b);
        System.out.printf( "Values are %d,%d\n",a,b);
        //Value of a=10 and b=5
        System.out.println("Value of a="+a+" and b="+b);
        System.out.printf("Value of a=%d and b=%d\n",a,b);
        //Sum of 10 and 5 = 15.
        System.out.println("Sum of "+a+" and "+b+" = "+(a+b)+".");
        System.out.printf("Sum of %d and %d = %d.",a,b,a+b);
	}
}
