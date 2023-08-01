public class FuncArray {
    public float calculateAveragge(int[] score) {
        int sum = 0;
        for (int index = 0; index < score.length; index++) {
            sum = sum + score[index];
        }
        return sum / score.length;
    }

    public static void main(String[] args) {
        FuncArray team = new FuncArray();
        int[] arr = { 30, 40, 32, 23, 34, 65, 75 };
        float result = team.calculateAveragge(arr);
        System.out.println(result);
    }

}
