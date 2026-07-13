
import java.util.*;

public class CollectionsEx8_1 {

	public static void main(String[] args) {
		Stack a=new Stack();
		
		a.add(10);
		a.add("Ram");
		a.add(7.2);
		a.add(90);
		a.add(10);
		a.add(5);
		
		System.out.println(a);
		System.out.println(a.pop());
		System.out.println(a);
		
		System.out.println(a);
		Iterator i=a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		ListIterator li=a.listIterator();
		System.out.println(li.next());
		System.out.println(li.previous());
		
		Enumeration e =a.elements();
		System.out.println(e.nextElement());
		
		for(Object f:a) {
			System.out.println(f);
		}
	}

}