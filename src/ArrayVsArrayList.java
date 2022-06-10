import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {
    public static void main(String[] args) {
        String[] friendsArray = new String[4];
        String[] friendArray2 = {"John", "Steve", "Chris", "Eric"};

        ArrayList<String> friendArrayList = new ArrayList<>();
        ArrayList<String> friendArrayList2 = new ArrayList<>(Arrays.asList("John", "Steve", "Chris", "Eric"));
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,3,4,5,6,7));
        System.out.println(friendArrayList2.get(1));
        System.out.println(friendArrayList2.size());

        friendArrayList2.add("Mitch");
        System.out.println(friendArrayList2.get(4));

        friendArrayList2.set(0, "Carl");
        System.out.println(friendArrayList2.get(0));
        System.out.println(friendArrayList2.get(1));
        friendArrayList2.remove(1);
        System.out.println(friendArrayList2.get(1));
        System.out.println(friendArrayList2);


    }
}
