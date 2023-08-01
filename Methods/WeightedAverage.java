import java.util.Scanner;

public class WeightedAverage {
    public void calculateWeightedAverage(int assignmentScore, int projectScore, int quizScore, int midTermScore,
            int finalExamScore) {

        int assignmentWeight = 10;
        int projectWeight = 35;
        int quizWeight = 10;
        int midTermWeight = 15;
        int finalExamWeight = 30;
        float overallPercentage;
        System.out.println("Weight     % Value of Score");
        float assignmentPercentageScore = (assignmentWeight / 100.0f) * assignmentScore;
        System.out.println("Assignments " + assignmentPercentageScore);
        float projectScorePercentage = (projectWeight / 100.0f) * projectScore;
        System.out.println("Project " + projectScorePercentage);
        float quizScorePercentage = (quizWeight / 100.0f) * quizScore;
        System.out.println("Quizzes " + quizScorePercentage);
        float midTermScorePercentage = (midTermWeight / 100.0f) * midTermScore;
        System.out.println("Mid term " + midTermScorePercentage);
        float finalExamScorePercentage = (finalExamWeight / 100.0f) * finalExamScore;
        System.out.println("Final Exam " + finalExamScorePercentage);
        System.out.println("");
        overallPercentage = (assignmentPercentageScore + projectScorePercentage + quizScorePercentage
                + midTermScorePercentage + finalExamScorePercentage);
        System.out.println("The weighted average score is " + overallPercentage + "%");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the assignment Score ");
        int assignmentScore = sc.nextInt();
        System.out.print("Enter the project Score ");
        int projectScore = sc.nextInt();
        System.out.print("Enter the quiz Score ");
        int quizScore = sc.nextInt();
        System.out.print("Enter the Term Score ");
        int midTermScore = sc.nextInt();
        System.out.print("Enter the Exam Score ");
        int finalExamScore = sc.nextInt();
        WeightedAverage obj = new WeightedAverage();
        obj.calculateWeightedAverage(assignmentScore, projectScore, quizScore, midTermScore, finalExamScore);

    }
}
