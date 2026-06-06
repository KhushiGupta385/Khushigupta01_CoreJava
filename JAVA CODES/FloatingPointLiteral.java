public class FloatingPointLiteral {
	public static void main(String[]args) {
		double d=123.456457;     //Normal-Floating Point Literal
//		double d1=1.23456457e+2; //Exponential Floating Point Literal
		double d11=1.23456457*100;
		System.out.println(d);
//		System.out.println(d1);
		System.out.println(d11);
		
		
		double d2=12___31__23.123___123_1;
//		double d2=___12___31__23__.___123___123_1__;//Not Allowed
		System.out.println(d2);
		
		double d3=098.99;       //Not treated as Octal
//		double d4=0b1011.1101; //Binary Not Allowed
//		double d5=0x64.33;    //Hexadeciaml not Allowed
		System.out.println(d3);
		
		double ddd=0125.987; 	//Noting like Octal
//		double d1=0b1001.101;	//Error
		double dddd=0x1.9p2;		//Hexadecimal Floating Point Literal
		System.out.println(ddd);
		System.out.println(dddd);
		
        double c1 = .5;
        double d1 = 5.;
        System.out.println(c1);
        System.out.println(d1);
	}
}