public class First {
    float coupon = 5;

    public First() {
        System.out.println("Welcome to my application");
        System.out.println("We provide welcome bonus" + this.coupon);
        coupon = 2;
        System.out.println("We provide welcome bonus" + coupon);

    }

    public static void main(String[] args) {
        {
            First peron1 = new First();
        }
    }
}