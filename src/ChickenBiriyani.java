public class ChickenBiriyani {

    public static void main(String[] args) {
        String[] itemArray = {"Chicken", "Cilantro Leaves", "Almond Slices", "Cumin", "Tomatoes", "Raisins", "Jalapeno", "Plain Yogurt", "Ginger Garlic Paste", "Garam Masala", "Salt", "Ground Turmeric", "Chilli Powder", "Lemon Juice", "Ghee", "Basmati Rice"};
        for(int i=0; i<itemArray.length; i++) {
            System.out.println(itemArray[i]);
        }
        String[] cookingSteps = new String[4];
        cookingSteps[0] = "Heat the oil over medium-high heat in a large nonstick skillet or frying pan.\r\nOnce the oil is shimmering, add the chicken pieces and let them cook, undisturbed, for 3-5 minutes until golden brown.";
        cookingSteps[1] = "Turn the chicken pieces and add the onion, jalapeno, ginger, garam masala, cumin, turmeric, and salt.\r\nSauté for 3 minutes, or until the onions have softened.";
        cookingSteps[2] = "Add the garlic, tomatoes, and raisins to the pan.\r\nStir well, then add the rice and broth.\r\nAllow the liquid to come to a boil, then cover the pan and turn the heat down to medium-low.\r\nLet the rice steam for 15 minutes.\r\nTurn off the heat and fluff the rice with a fork.\r\nRe-cover the pan, and allow the rice to continue to steam for another 10 minutes.";
        cookingSteps[3] = "Garnish with cilantro leaves and almond slices.\r\nServe the Biryani straight out of the pan, accompanied by lime wedges for squeezing.";
        for(int i=0; i<cookingSteps.length; i++) {
            System.out.println(cookingSteps[i]);
        }
    }
}
