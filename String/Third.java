public class Third {
    public static void main(String[] args) {
        String[] words = { "What", "is", "the", "shortest", "word", "is" };
        String shortest = words[0];
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() <= shortest.length()) {
                shortest = words[i];
            }
        }
        System.out.println(shortest);

    }
}
