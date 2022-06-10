import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        setDemo();
        SetDemo setDemo = new SetDemo();
        System.out.println(setDemo.getClass());

    }
    public static void setDemo() {
        Set<Integer> phoneNumber = new HashSet<>();
        phoneNumber.add(124325);
        phoneNumber.add(34634);
        phoneNumber.add(67896578);
        phoneNumber.add(123154);
        phoneNumber.add(456734);
        phoneNumber.add(34523);
        phoneNumber.add(678967);
        phoneNumber.add(34534);
        System.out.println(phoneNumber);

    }
}

