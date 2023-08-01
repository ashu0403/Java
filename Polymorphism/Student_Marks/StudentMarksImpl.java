
import java.util.Scanner;

public class StudentMarksImpl {
        public static void main(String[] args) {
                StudentMarks student = new StudentMarks();
                Scanner scanner = new Scanner(System.in);
                System.out.println("For which you want to calculateMarks");
                String t = scanner.next();
                if (t.equals("medical")) {
                        System.out.print("Enter the number of math");
                        int n = scanner.nextInt();
                        System.out.print("Enter the number of physic");
                        int n2 = scanner.nextInt();
                        System.out.println("Enter the number of chesmistry");
                        int n3 = scanner.nextInt();
                        System.out.println("Enter the number of biology");
                        int n4 = scanner.nextInt();
                        System.out.println(student.calculateMarks(n, n2, n3, n4));
                } else if (t.equals("non-medical")) {
                        System.out.print("Enter the number of math");
                        int n = scanner.nextInt();
                        System.out.print("Enter the number of physic");
                        int n2 = scanner.nextInt();
                        System.out.println("Enter the number of chesmistry");
                        int n3 = scanner.nextInt();
                        System.out.println(student.calculateMarks(n, n2, n3));
                } else if (t.equals("business")) {
                        System.out.print("Enter the marks of business_studies");
                        int n = scanner.nextInt();
                        System.out.print("Enter marks for finance");
                        int n2 = scanner.nextInt();
                        System.out.print("Enter marks for accounting");
                        int n3 = scanner.nextInt();
                        System.out.println(student.calculateMarks(n, n2, n3));
                } else {
                        System.out.println("Input correct value");
                }

        }
}
