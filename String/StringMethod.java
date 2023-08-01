public class StringMethod {
    public static void main(String[] args) {
        String[] name = { "Hello", "World", "Check", "Value" };
        int i = 0;
        while (i < name.length) {
            System.out.println(name[i].length());
            name[i] = name[i].toUpperCase();
            System.out.println(name[i]);
            i++;
        }
        System.out.println("Stats with C");
        for (int j = 0; j < name.length; j++) {
            if (name[j].startsWith("C")) {
                System.out.println(name[j]);
            }
        }
        for (int arrIndex = 0; arrIndex < name.length; arrIndex++) {
            int count = 0;
            for (int index = 0; index < name[arrIndex].length(); index++) {
                if (name[arrIndex].charAt(index) == 'A' || name[arrIndex].charAt(index) == 'E'
                        || name[arrIndex].charAt(index) == 'I' || name[arrIndex].charAt(index) == 'O'
                        || name[arrIndex].charAt(index) == 'U') {
                    count++;
                }
            }
            System.out.print(count + " ");
        }   }
}
