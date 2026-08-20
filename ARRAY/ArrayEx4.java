
public class ArrayEx4 {
	public static void main(String[] args) {
		
		int a[]={8,3,10,5,54,25,54,7,2,4,5,1,5};
		
		//add all elements 
		int s=0;
		for(int x:a) {
			s=s+x;
		}
		System.out.println("Sum: "+s);

		System.out.println("----------");
		
		//get elements in reverse
		for(int x=a.length-1;x>=0;x--) {
			System.out.println(a[x]);
		}
		
		System.out.println("----------");
		
		//get elements by one element skip
		for(int x=0;x<a.length;x+=2) {
			System.out.println(a[x]);
		}
	}
}