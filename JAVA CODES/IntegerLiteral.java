public class IntegerLiteral {
	 public static void main(String[] args) {
	        int a=104;          //Decimal Integer Literal
	        int b=0150;         //Octal Integer Literal     (iska decimal converion ans hoga)
//	        int c=0x68;         //Hexa-decimal Integer Literal
	        int c=0X68;										   //(iska decimal converion ans hoga)
//	        int d=0b1101000;    //Binary Integer Literal
	        int d=0B1101000;									//(iska decimal converion ans hoga)
	        System.out.println(a);
	        System.out.println(b);
	        System.out.println(c);
	        System.out.println(d);
	        
	        int aa =1___23____23___34____554;//Allowed
//	        int aa1 =_1___23____23___34____554_;//Not Allowed
	        System.out.println(aa); 
	    }
}
