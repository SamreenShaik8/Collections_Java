package listclasses;

import java.util.ArrayList;

public class HeterogeneousArrayList {

	public static void main(String[] args) {
		// Initialize an ArrayList
        ArrayList<Object> list = new ArrayList<>();

        // Add different types of elements
        list.add(10);              // Integer
        list.add("Hello");         // String
        list.add(3.14);            // Double
        list.add(true);            // Boolean
        list.add('A');             // Character
        System.out.println(list);
	}

}
