import java.util.*;

public class Second {
    public static void getAllStringName() {
        List<String> list = new ArrayList<String>();
        list.add("Johny");
        list.add("Bob");
        list.add("william");
        list.add("JeNNY");
        for (int i = 0; i < list.size(); i++) {
            String upperCase = list.get(i).toUpperCase();
            System.out.println(upperCase);
        }
    }

    public static void getTotalMarks() {
        ArrayList<Integer> marks = new ArrayList<Integer>();
        marks.add(78);
        marks.add(89);
        marks.add(90);
        marks.add(67);
        marks.add(56);
        int total = 0;
        for (int i = 0; i < marks.size(); i++) {
            total = marks.get(i) + total;
        }
        System.out.println("Total marks " + total);
    }

    public static void main(String[] args) {
        getAllStringName();
        getTotalMarks();
    }
}