
public class DivisibleBy5_3 {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter a Number:");
		int a=sc.nextInt();
		
		if(a%5==0 && a%3==0) {
			System.out.println(a+" is Divided by 5 and 3");
		}else {
			System.out.println(a+" is NOT Divided by 5 and 3");
		}
		
		System.out.println("Thanks for using APP");
		
		sc.close();
	}
}
