package Revise;

import java.util.*;
import java.lang.*;

public class First {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(12);
        list.add(1);
        list.add(3);
        list.add(2);
        Collections.sort(list);
        // Arrays.reverse(list);
        // for (Integer integer : list) {
        // System.out.println(integer);
        // }
        System.out.println(list);

    }
}
