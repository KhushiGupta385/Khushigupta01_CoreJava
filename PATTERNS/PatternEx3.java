
public class PatternEx3 {
	public static void main(String[] args) {
		int a=5,b=5;
		for(int x=1;x<=a;x++) {
			for(int y=1;y<=b;y++) {
				System.out.print("*");
			}
			b--;
			System.out.println();
		}
	}
}
