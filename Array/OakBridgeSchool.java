public class OakBridgeSchool {

    public int[] calculateTotalMarks(int[] math, int[] science, int[] english) {

        int[] totalMarks = new int[math.length];
        for (int i = 0; i < math.length; i++) {
            totalMarks[i] = (math[i] + science[i] + english[i]);
        }
        return totalMarks;

    }

    public int[] calculateTotalAverageMarksForEachStudent(int[] totalMarks, int noOfSubjects) {
        int[] a = new int[totalMarks.length];
        for (int i = 0; i < totalMarks.length; i++) {
            a[i] = (totalMarks[i]) / 3;
        }
        return a;

    }

    public int calculateAverageScienceMarks(int[] science) {
        int sum = 0;
        for (int i = 0; i < science.length; i++) {
            sum = (science[i] + sum);
        }
        System.out.println("Average Science marks scored by the class is : " + sum / science.length);
        return sum;
    }

    public int calculateAverageEnglishMarks(int[] english) {
        int sum = 0;
        for (int i = 0; i < english.length; i++) {
            sum = (english[i] + sum);
        }
        System.out.println("Average English marks scored by the class is : " + sum / english.length);
        return sum;
    }

    public int calculateAverageMathMarks(int[] math) {
        int sum = 0;
        for (int i = 0; i < math.length; i++) {
            sum = (math[i] + sum);
        }
        System.out.println("Average Math marks scored by the class is    : " + sum / math.length);
        return sum;
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        int[] math = { 88, 89, 100, 70, 60, 80, 35, 3, 25, 56 };
        int[] science = { 80, 83, 99, 67, 56, 84, 38, 9, 32, 65 };
        int[] english = { 90, 98, 100, 65, 54, 82, 40, 13, 45, 67 };
        String[] studentName = { "Michelle", "Kate", "Ann", "Tina", "Tom", "Sam", "Ria", "Pam", "Lenna", "Leo" };
        int[] rollNos = { 102, 109, 101, 103, 104, 108, 110, 105, 106, 107 };
        OakBridgeSchool okoOakBridgeSchool = new OakBridgeSchool();
        int totalMarksT[] = okoOakBridgeSchool.calculateTotalMarks(math, science, english);
        int[] totalAverage = okoOakBridgeSchool.calculateTotalAverageMarksForEachStudent(totalMarksT, 3);
        for (int i = 0; i < english.length; i++) {
            System.out.println("------------------------------------------");
            System.out.println("Name of Student " + studentName[i] + "||" + "Roll Number ::" + rollNos[i]);
            System.out.println("--------------------------------------------------------");
            System.out.println("The Total Marks is " + totalMarksT[i]);
            System.out.println("The Average Marks " + totalAverage[i]);
            System.out.println("-----------------------------------------");
        }
        okoOakBridgeSchool.calculateAverageScienceMarks(science);
        okoOakBridgeSchool.calculateAverageMathMarks(math);
        okoOakBridgeSchool.calculateAverageEnglishMarks(english);
        long finishTime = System.currentTimeMillis();
        System.out.println("That took: " + (finishTime - startTime) + " ms");

    }
}