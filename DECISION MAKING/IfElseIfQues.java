
public class IfElseIfQues {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		
		if(a%5==0 && a%3==0) {
			System.out.println(a+" is Divisible by 5 and 3");
		}else if(a%5==0) {
			System.out.println(a+" is Divisible by 5");
		}else if(a%3==0) {
			System.out.println(a+" is Divisible by 3");
		}else{
			System.out.println(a+" is NOT Divisible by 5 and 3");
		}
		
		System.out.println("Thanks for using APP");
	}
}
