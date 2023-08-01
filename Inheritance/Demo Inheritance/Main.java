public class Main {
    public static void main(String[] args) {
        manager manger = new manager();
        manger.EID = 101;
        manger.name = "Harry";
        manger.exp = 2.5;
        manger.displaydetais();
        Programmer pro = new Programmer();
        pro.EID = 102;
        pro.name = "gaurav";
        pro.programingLanguage = "java";
        pro.display();
        Expert expert = new Expert();
        expert.EID = 103;
        expert.name = "Naruto";
        expert.exp = 20;
        expert.showInfo();
    }
}