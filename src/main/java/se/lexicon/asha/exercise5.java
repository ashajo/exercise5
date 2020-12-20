package se.lexicon.asha;

public class exercise5 {
    public static void main(String[] args) {

        final String[][] matrix = {{"France","Paris"}, {"Sweden","Stockholm"}};

        for (String[] String : matrix) {

            for (int i = 0; i < String.length; i++) {
                System.out.print(String[i] + " ");
            }

            System.out.println();
        }
    }
}
