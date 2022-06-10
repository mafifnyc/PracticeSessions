import java.util.ArrayList;
import java.util.LinkedHashSet;

public class DeleteDuplicates {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("Steve");
        arrList.add("Mark");
        arrList.add("Frank");
        arrList.add("Paul");
        arrList.add("George");
        arrList.add("Jordan");
        arrList.add("Robert");
        arrList.add("Steve");
        arrList.add("Steve");
        arrList.add("Steve");
        System.out.println(arrList);
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(arrList);
        arrList.clear();
        arrList.addAll(linkedHashSet);
        System.out.println(arrList);


    }
}
