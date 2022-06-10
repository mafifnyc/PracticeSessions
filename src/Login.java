public class Login {
    public static void main(String[] args) {
        // How to get environment variable using Java?
        // How to pass/send environment variable using terminal?
        // List of default getProperty()  arguments https://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html
        // Set environment variable myEnv with a default value
        //System.setProperty("myEnv", "Default Junk Value");
        // Get environment variable
//        String envVariable = System.getProperty("env", "Default");
//        System.out.println(envVariable);
        Login login = new Login();
        login.authenticateUser(args[0], args[1]);
    }

    public void authenticateUser(String userName, String password){
        // Credentials are always String type
        // Validate the user is valid one or not
        Login login = new Login();
        String[] affiliateUserNameArray = {"John", "Jack", "Don"};
        

        if(userName == affiliateUserNameArray[0]){
            System.out.println("This is valid Affiliate User");
            login.authorizeUser("affiliate");
        }
        else{
            System.out.println("Invalid User!!!!");
        }
    }

    public void authorizeUser( String userType){
        // Authorization means what a valid user are permitted to see.
        if (userType == "affiliate"){
            System.out.println("Show him Affiliate Dashboard!!!!");
        }
        else if (userType == "admin"){
            System.out.println("Show him Admin Dashboard");
        }

    }

}
