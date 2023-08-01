public class AgeCheck {
    // Step -2
    public static void checkAge(int age) throws ImporperAge {

        try {

            if (age < 13)
                throw new ImporperAge();
            else {
                System.out.println("Valid Age: " + age);
            }
        } catch (ImporperAge e) {
            System.out.println(e.getMsg());
        }

    }

    // Step 3
    public static void main(String[] args) throws ImporperAge {

        checkAge(15);
    }
}
