public class Demo {
    String Name;
    final double pi = 3.14157;

    public Demo() {
        System.out.println("No argument Constructor");

    }

    public Demo(String name) {
        Name = name;
        System.out.println(this.Name + " Parametrized Counstroct");
        System.out.println(this.pi + " Pi Value");
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        Demo demo1 = new Demo("Sam");
    }

}
