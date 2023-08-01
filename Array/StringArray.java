public class StringArray {
    public static void main(String args[]) {
        String[] words = { "Java", "Programming", "Language", "Java", "h" };
        String shortest = words[0];
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() <= shortest.length()) {
                shortest = words[i];
            }
        }
        System.out.println(shortest);
    }
}
