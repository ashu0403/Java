public class Demo {
    public static void main(String[] args) {
        int[] arr = { 15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14 };
        // 25,20,19,16,15,14,10,7,5,4,3,1
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 5) {
                System.out.println(i);
            }
        }

    }
}
