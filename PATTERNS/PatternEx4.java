
public class PatternEx4 {
	public static void main(String[] args) {
		int a=5,b=-1;
		for(int x=1;x<=a;x++) {
			System.out.print("*");
			for(int y=1;y<=b;y++) {
				if(x!=a) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			if(x!=1) {
				System.out.print("*");
			}
			b++;
			System.out.println();
		}
	}
}
