package com.election;

import java.util.Scanner;

public class VoterImpl {
    public static void main(String[] args) {
        Voter obj = new Voter();
        System.out.print("Enter the Age of Voter => ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        // Call the Setter of Age
        obj.setAge(age);
        System.out.print("Enter the Name of the Voter => ");
        String name = sc.next();
        // Call the setter of Nmae
        obj.setName(name);
        // Call the Constrructor
        System.out.println(obj.Voter());
    }
}
