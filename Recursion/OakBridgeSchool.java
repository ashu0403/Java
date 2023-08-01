public class OakBridgeSchool {
    public int[] calculateTotalMarks(int math[], int science[], int english[]) {
        int totalMarks[] = new int[math.length];
        for (int i = 0; i < math.length; i++) {
            totalMarks[i] = math[i] + science[i] + english[i];
        }
        return totalMarks;
    }

    public int[] calculateTotalAverageMarks(int totalMarks[], int noOfSubjects) {
        int totalAverageMarks[] = new int[totalMarks.length];
        for (int i = 0; i < totalMarks.length; i++) {
            totalAverageMarks[i] = totalMarks[i] / noOfSubjects;
        }
        return totalAverageMarks;
    }

    public int findTopScore(int totalMarks[], int len) {
        if (len <= 1) {
            return totalMarks[len - 1];
        }
        if (totalMarks[len - 1] > findTopScore(totalMarks, len - 1)) {
            return totalMarks[len - 1];
        } else
            return findTopScore(totalMarks, len - 1);
    }

    public double sumOfArray(int array[], int len) {
        if (len == 1) {
            return array[len - 1];
        }

        return array[len - 1] + sumOfArray(array, len - 1);
    }

    public double calculateAverageScienceMarks(int science[], int len) {
        return sumOfArray(science, len) / len;
    }

    public double calculateAverageEnglishMarks(int english[], int len) {
        return sumOfArray(english, len) / len;
    }

    public double calculateAverageMathMarks(int math[], int len) {
        return sumOfArray(math, len) / len;
    }

    public static void main(String[] args) {
        int math[] = { 88, 90, 100, 70, 60, 90, 35, 3, 25, 46 };
        int science[] = { 80, 83, 99, 67, 56, 84, 38, 9, 32, 55 };
        int english[] = { 92, 90, 90, 65, 54, 92, 40, 13, 45, 57 };
        String[] studentNames = { "Michelle", "Kate", "Ann", "Tina", "Tom", "Sam", "Ria", "Pam", "Leena", "Leo" };
        int rollNos[] = { 102, 109, 101, 103, 104, 108, 110, 105, 106, 107 };
        int len = 10;
        int noOfSubjects = 3;
        OakBridgeSchool oakBridgeSchool = new OakBridgeSchool();
        int totalMarks[] = oakBridgeSchool.calculateTotalMarks(math, science, english);
        int totalAverageMarks[] = oakBridgeSchool.calculateTotalAverageMarks(totalMarks, noOfSubjects);
        double scienceAverage = oakBridgeSchool.calculateAverageScienceMarks(science, len);
        double mathAverage = oakBridgeSchool.calculateAverageMathMarks(math, len);
        double englishAverage = oakBridgeSchool.calculateAverageEnglishMarks(english, len);

        for (int i = 0; i < math.length; i++) {
            System.out.println("---------------------------------------------------------------------");
            System.out.println("Student Name :: " + studentNames[i] + " || Roll Number :: " + rollNos[i]);
            System.out.println("---------------------------------------------------------------------");
            System.out.println("The Total Marks    - " + totalMarks[i] + "/300");
            System.out.println("The Average Marks  - " + totalAverageMarks[i]);
            System.out.println("_____________________________________________________________________");
        }
        System.out.println();
        System.out.println("Average Science Marks scored by the class is : " + scienceAverage);
        System.out.println("Average Math Marks scored by the class is : " + mathAverage);
        System.out.println("Average English Marks scored by the class is : " + englishAverage);
    }
}