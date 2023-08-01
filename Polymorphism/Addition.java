public class Addition {
    // crate a class claaed Addition and create a method called add
    // 3 form of add is required
    // 1. will take 1 int parameter
    // 2. 1 int and float
    // float, int
    void add(int i) {
        System.out.println(i);
    }

    // int followed by float
    void add(int i, float f) {
        System.out.println(i + f);
    }

    // float followed by int
    void add(float f, int i) {
        System.out.println(f + i);
    }

    // Driver method
    public static void main(String[] args) {
        //Invoking the constructor method
        Addition a = new Addition();
        Addition b = new Addition(100);
        a.add(1);
        a.add(1, 22.32f);
        a.add(12.23f, 2);

    }
// Non-argument constructor
    public Addition() {
        System.out.println("Zero parameter constructor");
    }
//Parameterised constructor
    public Addition(int i) {
        System.out.println("Constructor with one parameter " + i);
    }
}
