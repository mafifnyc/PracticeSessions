public class PinkArray {
    public void searchPink(String[] colors, String particularColor) {
        for(int i=0; i<colors.length; i++) {
            if (colors[i] == particularColor) {
                System.out.println("Found");
            }
        }
    }

    public static void main(String[] args) {
        String[] colors = {"Black", "White", "Red", "Green", "Pink"};
        PinkArray findColor = new PinkArray();
        findColor.searchPink(colors, "Pink");
    }
}
