public class NameImpl {
    public static void main(String[] args) {
        Name name = new Name() {

            public String checkIfNameBeginsWithA(String name) {
                return name.startsWith("A") ? "Name begins with A" : "Name does not begin with A";
            }
        };
        System.out.println(name.checkIfNameBeginsWithA("Abraham"));
    }
}