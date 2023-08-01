public class BankImpl {
    public static void main(String[] args) {
        bankA A = new bankA();
        bankB B = new bankB();
        bankC C = new bankC();
        System.out.println(A.getbalance(1000));
        System.out.println(B.getbalance(2000));
        System.out.println(C.getbalance(3000));
    }
}
