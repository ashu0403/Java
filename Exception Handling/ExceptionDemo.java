
public class ExceptionDemo {
    // Artimatic Exxception
    public void add() {
        try {
            int num1 = 1;
            int num2 = 0;
            int num3 = num1 / num2;
            System.out.println("num3 is " + num3);
        } catch (NullPointerException e) {

            System.out.println("ArithmeticException " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ExceptionDemo demo = new ExceptionDemo();
        demo.add();
        System.out.println("End of program");
    }
}
