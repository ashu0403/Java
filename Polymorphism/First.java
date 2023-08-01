public class First {
    // Writing a program of polymorphism
    // Method overloading
    void statement(String name) {
        System.out.println("Hi myself is " + name);
    }

    void statement(String fname, String lname) {
        System.out.println("Hi myself is " + fname + " " + lname);
    }

    public static void main(String[] args) {
        First first = new First();
        first.statement("John");
        first.statement("Gupta", "A");
    }

}