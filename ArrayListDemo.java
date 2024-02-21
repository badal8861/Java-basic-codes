import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add("badal");
		al.add('c');
		al.remove(0);
		
		System.out.println(al);
//	   Iterator itr=al.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
		}
	}
}

