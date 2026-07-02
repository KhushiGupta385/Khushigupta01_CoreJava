
public class IfElseIfEx2 {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		System.out.println("Enter a number:");
		int b=sc.nextInt();
		System.out.println("Enter a number:");
		int c=sc.nextInt();
		System.out.println("Enter a number:");
		int d=sc.nextInt();
		
		if(a==b && a==c && a==d) {
			System.out.println("All are equal!");
		}else if(a>b && a>c && a>d){
			System.out.println(a+" is Greatest!");
		}else if(b>c && b>d){
			System.out.println(b+" is Greatest!");
		}else if(c>d){
			System.out.println(c+" is Greatest!");
		}else{
			System.out.println(d+" is Greatest!");
		}
		
		System.out.println("Thanks for using APP");
	}

}
