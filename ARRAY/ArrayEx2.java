import java.util.Scanner;

public class ArrayEx2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size:");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter the "+(i+1)+" value:");
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			System.out.println("The "+(i+1)+" value:");
			System.out.println(a[i]);
		}
		sc.close();
	}
}
