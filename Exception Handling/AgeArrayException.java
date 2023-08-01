public class AgeArrayException {
    public static void main(String[] args) {
        // write proram on age array with out of bound exception
        int age[] = { 1, 2, 3, 4 };
        try {
            for (int i = 0; i <= age.length; i++) {
                System.out.print(" " + age[i]);

            }

        }
        // Handling the exception
        catch (NullPointerException e) {
            System.out.println("Array index out of bounds");
            e.printStackTrace();
        }
        System.out.println("THis line is executed");
    }
}
