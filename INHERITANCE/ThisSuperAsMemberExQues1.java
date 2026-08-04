
class Q{
	int x=10;
	void m(int x) {
		//x=9;
		this.x=9;
		System.out.println(this.x);
		System.out.println(x);
	}
}
public class ThisSuperAsMemberExQues1 {
	public static void main(String[] args) {
		Q q=new Q();
		q.m(15);
		System.out.println(q.x);
	}
}