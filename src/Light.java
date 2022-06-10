public class Light {
    boolean lightSwitchPosition;
    static String time = "day";
    int x;
    public Light() {
        System.out.println("Default Constructor");
    }
    public Light(int y) {
        System.out.println("Parameterized Constructor " + y);
    }
    public void turnOnLight() {
        lightSwitchPosition = true;
        System.out.println("Light On");
    }
    public void turnOffLight() {
        lightSwitchPosition = false;
        System.out.println("Light Off");
    }
    public void createLightObjectByPerameterizedOperator() {
        Light tubeLight = new Light(2);
        if(time=="day") {
            tubeLight.turnOffLight();
        }
        else {
            tubeLight.turnOnLight();
        }

    }

    public static void main(String[] args) {
        Light bedLight = new Light();
        bedLight.createLightObjectByPerameterizedOperator();
    }
}