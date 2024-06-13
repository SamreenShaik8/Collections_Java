package listclasses;
import java.util.*;

public class Linkedlistprogram {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(1, 100); // at index 1 the element 100 will be added
        ll.add(20);
        ll.add(30);
        ll.add(40);
        System.out.println(ll);
    }
}
