public class OakBridgeSchool {
    public char findGradeInMath(int math) {
        char grade = ' ';
        if (math >= 90) {
            grade = 'A';
        } else if (math >= 80 && math <= 89) {
            grade = 'B';
        } else if (math >= 70 && math <= 79) {
            grade = 'C';
        } else if (math >= 60 && math <= 69) {
            grade = 'D';
        } else if (math <= 59) {
            grade = 'F';
        }
        return grade;
    }

    public char findGradeInScience(int science) {
        char grade = ' ';
        if (science >= 90) {
            grade = 'A';
        } else if (science >= 80 && science <= 89) {
            grade = 'B';
        } else if (science >= 70 && science <= 79) {
            grade = 'C';
        } else if (science >= 60 && science <= 69) {
            grade = 'D';
        } else if (science <= 59) {
            grade = 'F';
        }
        return grade;
    }

    public char findGradeInEnglish(int english) {
        char grade = ' ';
        if (english >= 90) {
            grade = 'A';
        } else if (english >= 80 && english <= 89) {
            grade = 'B';
        } else if (english >= 70 && english <= 79) {
            grade = 'C';
        } else if (english >= 60 && english <= 69) {
            grade = 'D';
        } else if (english <= 59) {
            grade = 'F';
        }
        return grade;
    }

    public int[] calculateTotalMarks(int[] math, int[] science, int[] social) {
        int n = math.length;
        int[] totalmarks = new int[n];
        for (int i = 0; i < n; i++) {
            totalmarks[i] = math[i] + science[i] + social[i];
        }
        return totalmarks;
    }

    public float[] calculateaveragetotalmarks(int[] totalmarks, int noofsubject) {
        int n = totalmarks.length;
        float[] averagemarks = new float[n];
        for (int i = 0; i < n; i++) {
            averagemarks[i] = totalmarks[i] / noofsubject;
        }
        return averagemarks;
    }

    public void displaydetails(int totalmarks, float averagemarks, char mathgrade, char sciencegrade, char englishgrade,
            String studentsname, int rollno) {
        System.out.println("-----------------------------------------------------------");
        System.out.println("Grading and Evaluation");
        System.out.println("------------------------------------------------------------");
        System.out.println("----------------------------------------------------------");
        System.out.println("Student Name                                Roll Number");
        System.out.println("----------------------------------------------------------");
        System.out.println(studentsname + "                             " + rollno);
        System.out.println("The Total marks Scored : " + totalmarks);
        System.out.println("The Average marks Scored : " + averagemarks);
        System.out.println("----------------------------------------------------------");
        System.out.println();
        System.out.println("Garde in Math : " + mathgrade);
        System.out.println("Garde in Science : " + sciencegrade);
        System.out.println("Grade in English : " + englishgrade);
        System.out.println("----------------------------------------------------------");
    }

    public int[] sortbytotalmarks(int[] arr) {
        int n = arr.length;
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 0; j < n - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        OakBridgeSchool oak = new OakBridgeSchool();
        int[] math = { 88, 89, 100, 70, 60, 80, 35, 3, 25, 56 };
        int n = math.length;
        int subject = 3;
        int[] science = { 80, 83, 99, 67, 56, 84, 38, 9, 32, 65 };
        int[] english = { 90, 98, 100, 65, 54, 82, 40, 13, 45, 65 };
        String[] studentsname = { "Michelle", "kate", "Ann", "Tina", "Tom", "Sam", "Ria", "Pam", "Leena", "Leo" };
        int[] rollNos = { 102, 109, 101, 103, 104, 108, 110, 105, 106, 107 };
        int[] totalmarks = oak.calculateTotalMarks(math, science, english);
        int max = 0;
        int a = 0;
        for (int i = 0; i < n; i++) {
            if (max < totalmarks[i]) {
                max = totalmarks[i];
                a = i;
            }
        }
        int c = totalmarks[a];
        float[] averagemarks = oak.calculateaveragetotalmarks(totalmarks, subject);
        for (int i = 0; i < n; i++) {
            char m = oak.findGradeInMath(math[i]);
            char s = oak.findGradeInScience(science[i]);
            char e = oak.findGradeInEnglish(english[i]);
            int totalmark = totalmarks[i];
            float averagemark = averagemarks[i];
            String name = studentsname[i];
            int roll = rollNos[i];
            oak.displaydetails(totalmark, averagemark, m, s, e, name, roll);
        }
        int[] sortedtotalmarks = oak.sortbytotalmarks(totalmarks);
        System.out.println();
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Report ");
        System.out
                .println("------------------------------------------------------------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.println(sortedtotalmarks[i]);
        }
        System.out.println();
        System.out.println();
        System.out.println("The maximum marks obtained by student details : ");
        System.out.println("Name : " + "               " + studentsname[a]);
        System.out.println("Roll no :" + "             " + rollNos[a]);
        System.out.println("Maths marks :" + "         " + math[a]);
        System.out.println("Science Marks :" + "       " + science[a]);
        System.out.println("English Marks :" + "       " + english[a]);
        System.out.println("Total Marks : " + "        " + c);
        System.out.println("Total Average Marks" + "   " + (math[a] + english[a] + science[a]) / 3);
    }
}