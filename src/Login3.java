import sun.rmi.runtime.Log;

import java.util.HashMap;

public class Login3 {
    public void authenticateUser(String userName, String password) {

        HashMap<String, String> affiliateUserNamePasswordMap = new HashMap<>();
        affiliateUserNamePasswordMap.put("John", "AbcQwe123");
        affiliateUserNamePasswordMap.put("Steve", "ZbcXwe423");
        affiliateUserNamePasswordMap.put("Mark", "CbcVwe523");
        affiliateUserNamePasswordMap.put("Jerry", "BbcNwe623");
        System.out.println(affiliateUserNamePasswordMap.containsKey(userName));
        System.out.println(affiliateUserNamePasswordMap.containsValue(password));



    }

    public static void main(String[] args) {
        Login3 cred = new Login3();
        cred.authenticateUser("John", "ZbcXwe423");

    }
}
