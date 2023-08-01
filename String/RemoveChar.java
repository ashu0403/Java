public class RemoveChar {
    public static void main(String[] args) {
        String str = "Gaurav";
        char ch = 'a';
        Remove(str, ch);

    }

    public static void Remove(String str, char c) {
        int n = str.length();
        String finalStr = "";
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) != c) {
                finalStr = finalStr + str.charAt(i);
            }
        }
        System.out.println(finalStr);
    }
}
