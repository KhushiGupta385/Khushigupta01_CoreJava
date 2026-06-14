public class CubeApp {
    public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter a No.:");
		int n=sc.nextInt();
		int r=n*n*n;
		System.out.println("Cube: "+r);
		sc.close();
	}
}
