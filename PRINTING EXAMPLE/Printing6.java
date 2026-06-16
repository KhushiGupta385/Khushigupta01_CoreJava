public class Printing6 {
    public static void main(String[] args) {
		int a=10,b=5;
        System.out.println(a+"h");
        System.out.println(a+'h');
        System.out.println(a+"hi");
		System.out.println(a+"hi"+b);
		System.out.println(4+a+"hi"+b);
		System.out.println(4+a+"hi"+b+2);
		System.out.println(4+a+"hi"+(b+2));
		System.out.println(a+'a'+"hi"+'a');
		System.out.println(a-'a'+"hi"+'a'+a);
		//System.out.println(a-4+"hi"+a-4);//error
		System.out.println(a-4+"hi"+(a-4));
		System.out.println(a*4+"hi"+a*4);
	}
}
