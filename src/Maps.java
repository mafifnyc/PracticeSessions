import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        HashMap<String, String> empIDs = new HashMap<>();
        empIDs.put( "1001", "John");
        empIDs.put("1002", "Steve");
        empIDs.put("1003", "Carl");
        empIDs.put("1004", "Mark");
        empIDs.put("1005", "Jerry");

        System.out.println(empIDs);
        System.out.println(empIDs.get("1001"));

        System.out.println(empIDs.containsKey("1002"));
        System.out.println(empIDs.containsValue("Jerry"));




    }
}
