public class Login2 {

    public String authenticateUser(String userName) {

        String affiliateUserNameArray[] = {"John", "Jack", "Donald", "Steve", "Frank"};


        for(String n : affiliateUserNameArray) {
            if(n==userName) {
                return "Valid Affiliate User";
            }
        }
        return "Invalid User Name";
    }
    public String authenticatePassword(String password) {
        String affiliatePasswordArray[] = {"AbcQwe123", "ZbcXwe423", "CbcVwe523", "BbcNwe623", "MbcTwe723"};
        for(String n : affiliatePasswordArray) {
            if(n==password) {
                return "Valid Affiliate User";
            }
        }
        return "Invalid Password";
    }

    public static void main(String[] args) {
        Login2 login = new Login2();
//        System.out.println(login.authenticateUser("Donald"));
//        System.out.println(login.authenticatePassword("ZbcXwe423"));
        login.authenticateUser(args[0]);
    }
}
