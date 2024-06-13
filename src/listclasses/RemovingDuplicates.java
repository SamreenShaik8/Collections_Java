package listclasses;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemovingDuplicates {

    public static void main(String[] args) {
        // Initialize an ArrayList and add elements
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(30);
        al.add(10);
        System.out.println("Original list: " + al);

        // Create a HashSet from the ArrayList to remove duplicates
        Set<Integer> hs = new HashSet<>(al);
        
        // Create a new ArrayList from the HashSet
        ArrayList<Integer> al1 = new ArrayList<>(hs);
        System.out.println("List after removing duplicates: " + al1);
    }
}
