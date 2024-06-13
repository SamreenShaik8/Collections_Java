package listclasses;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MergeAndRemoveDuplicates {
    public static void main(String[] args) {
        // Initialize two ArrayLists and add elements
        List<String> list1 = new ArrayList<>();
        list1.add("apple");
        list1.add("banana");
        list1.add("cherry");

        List<String> list2 = new ArrayList<>();
        list2.add("banana");
        list2.add("date");
        list2.add("apple");

        // Merge the two lists
        list1.addAll(list2);

        // Remove duplicates using HashSet
        Set<String> set = new HashSet<>(list1);

        // Create a new ArrayList from the HashSet
        List<String> resultList = new ArrayList<>(set);
        System.out.println("Merged list without duplicates: " + resultList);
    }
}
