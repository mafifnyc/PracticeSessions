public class Coffee {

    int milk;
    int sugar;

    Coffee(int m, int s) {
        System.out.println("Parameterized Constructor called.");
        milk = m;
        sugar = s;
    }

    public static void main(String args[]) {
        //constructor call
        Coffee object = new Coffee(2, 2);

        //print values of object properties
        System.out.println("milk = " + object.milk);
        System.out.println("sugar = " + object.sugar);
    }
}

