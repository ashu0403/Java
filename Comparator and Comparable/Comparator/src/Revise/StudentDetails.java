package Revise;

import java.util.*;
import java.util.Collections;
import java.util.List;

public class StudentDetails {

    public static void main(String[] args) {
        List<Integer> registrationsNumberList = Arrays.asList(242556, 676767, 871340, 121234, 753452, 101223, 456478);
        System.out.println("The Registration List Before Sorting");
        for (Integer i : registrationsNumberList) {
            System.out.println(i);
        }
        Collections.sort(registrationsNumberList);
        System.out.println("The Registration List After Sorting");
        for (Integer i : registrationsNumberList) {
            System.out.println(i);

        }
        
    }
}
