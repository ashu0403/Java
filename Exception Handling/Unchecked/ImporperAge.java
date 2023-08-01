public class ImporperAge extends Exception {
    //creadting user defined exception

    public ImporperAge(){
        System.out.println("User Defined Exception");
    }
    public String getMsg(){
        return "Caught Excetion";
    }
}