import java.util.Arrays;

public class OakBridge_String {
    public static String[] convertToUpperCase(String[] name) {
        String[] upper = new String[name.length];
        for (int i = 0; i < name.length; i++) {
            upper[i] = name[i].toUpperCase();
        }
        return upper;
    }

    public static String[] sortInAlphabeticalOrder(String[] names) {

        for (int i = 1; i < names.length; i++) {
            int j = i-1;
            String temp = names[i];
            while (j >= 0 && names[j].compareToIgnoreCase(temp) > 0) {
                names[j+1] = names[j];
                j = j - 1;
            }
            names[j+1] = temp;
        }
        return names;
    }

    public static String shortestName(String[] surname) {
        if (surname == null || surname.length < 1) {
            return "";
        }
        String smallestL = surname[0];
        for (int i = 1; i < surname.length; i++) {
            if (surname[i].length() < smallestL.length()) {
                smallestL = surname[i];
            }
        }
        return smallestL;
    }

    public static boolean checkIfNamesAreRepeated(String[] names) {
        int count = 0;
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length - 1; j++) {
                if (names[i] == names[j]) {
                    count = count + 1;
                }
            }
        }
        if (count > 0) {
            return true;
        } else {
            return false;
        }

    }

    public static String[] concatenateNameAndSurName(String[] names, String[] surnames) {
        String[] FullName = new String[names.length];
        for (int i = 0, j = 0; i < names.length; i++, j++) {
            FullName[j] = names[i].concat(" ").concat(surnames[i]);
        }
        return FullName;
    }

    public void displayStudentName(String[] nameArrya) {

    }

    public static void main(String[] args) {
        String[] studentNames = { "Michelle", "Kate", "Ann", "Tina", "Tom", "Sam", "Ram", "Pam", "Kate", "Leo" };
        String[] studentSurnames = { "Smith", "Johnson", "Williams", "Brown", "Jones", "Miller", "Davis", "Martin",
                "Clark", "King" };
        int size = studentNames.length;
        String[] upCase = new String[size];
        String[] SurName = new String[size];
        upCase = convertToUpperCase(studentNames);

        System.out.println(Arrays.deepToString(upCase));
        SurName = sortInAlphabeticalOrder(studentSurnames);
        for (int j = 0; j < SurName.length; j++) {
            System.out.print(SurName[j] + " ");
        }
        System.out.println();
        String shortname = shortestName(studentSurnames);
        System.out.println("The shortest surname is : " + shortname);
        String[] concat = concatenateNameAndSurName(studentNames, studentSurnames);
        System.out.println(Arrays.deepToString(concat));
        System.out.println("There are repeated name in the name List : " + checkIfNamesAreRepeated(studentNames));

    }
}
