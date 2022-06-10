public class MaxValue {
    public void getTwoMaxValue(int[] nums) {
        int maxOne = 0;
        int maxTwo = 0;
        for (int n : nums) {
           if(maxOne < n) {
               maxTwo = maxOne;
               maxOne = n;
           }
           else if(maxTwo<n) {
               maxTwo = n;
           }
        }
        System.out.println("MaxONE - " + maxOne);
        System.out.println("MaxTWO - " + maxTwo);
    }

    public static void main(String[] args) {
        MaxValue twoNumbers = new MaxValue();
        int list[] = {91,42,37,46,53,64,77,58,29};
        twoNumbers.getTwoMaxValue(list);
    }
}
