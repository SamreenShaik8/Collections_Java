package listclasses;
import java.util.*;

public class Almethods {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
//		we can add hetrogeneous data in arraylist which connot add in arrays
		al.add(10);
		al.add('A');
		al.add(30.0f);
		al.add(20);
//		at index 1 the element 70 will be added and other element swaped
		al.add(1,70);
		System.out.println(al);
		
		
	}

}
