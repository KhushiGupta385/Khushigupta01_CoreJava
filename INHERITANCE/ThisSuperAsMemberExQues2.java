
class O{
	int x=12;
}
class P extends O{
	int x=10;
	void m(int x) {
		x=super.x;
		this.x++;
		super.x += this.x;
		System.out.println(x);
		System.out.println(super.x);
	}
}
public class ThisSuperAsMemberExQues2 {
	public static void main(String[] args) {
		P p=new P();
		p.m(15);
		System.out.println(p.x);
	}
}