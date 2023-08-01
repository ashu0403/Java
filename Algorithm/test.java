public class test {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        doSomething();
        long finishTime = System.currentTimeMillis();
        System.out.println("That took: " + (finishTime - startTime) + " ms");
    }

    public static void doSomething() {
        for (int i = 0; i < 5000; i++) {
            System.out.println("Hleowe");
        }
    }
}
