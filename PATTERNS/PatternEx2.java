
public class PatternEx2 {
	public static void main(String[] args) {
		int a=5,b=1,c=4;
		for(int x=1;x<=a;x++) {
			for(int y=1;y<=c;y++) {
				System.out.print(" ");
			}
			for(int y=1;y<=b;y++) {
				System.out.print("*");
			}
			b++;
			c--;
			System.out.println();
		}
	}
}
