import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {
        LinkedList<String> namesLinkedList = new LinkedList<>();
        namesLinkedList.add("John");
        namesLinkedList.add("Paul");
        namesLinkedList.add("George");
        namesLinkedList.add("Ringo");
        ArrayList<String> namesArrayList = new ArrayList<>();
        System.out.println(namesLinkedList.get(2));
        namesLinkedList.add(1, "Jerry");
        namesArrayList.add(1, "Jerry");

    }
}
