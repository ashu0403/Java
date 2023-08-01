package com.jap;

import java.util.*;

public class StudentService {
    public static Set<Student> getAllStudentData() {
        // create six student object by calling Student class parameterized constructor
        Student student = new Student("John", 23, 500);
        Student student1 = new Student("Bob", 26, 545);
        Student student2 = new Student("William", 15, 400);
        Student student3 = new Student("Kevin", 29, 489);
        Student student4 = new Student("Johnson", 30, 578);
        Student student5 = new Student("Catherine", 25, 490);
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(student);
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);
        studentSet.add(student4);
        studentSet.add(student5);

        // create HashSet object and add all the students object inside it

        // return the HashSet object

        return studentSet;
    }

    public static Set<String> getAllStudentNameInSorted(Set<Student> studentSet) {
        // Create a TreeSet object
        TreeSet<String> childSet = new TreeSet<>();
        // Use Iterator object of type <Student> to iterate through the studentSet
        Iterator<Student> iterator = studentSet.iterator();
        // get all the name and add it inside the TreeSet object
        while (iterator.hasNext()) {
            Student student = iterator.next();
            childSet.add(student.getName());
        }

        // return the TreeSet object;
        return childSet;
    }

    public static Map<String, Integer> calculateAverage(Set<Student> studentSet) {
        // create a HashMap object of type <String,Integer>
        HashMap<String, Integer> result = new HashMap<String, Integer>();

        // Use Iterator object of type <Student>to iterate through the studentSet
        Iterator<Student> iterator = studentSet.iterator();

        // retrieve the Student object from the iterator
        int sum = 0;
        int count = 0;
        while (iterator.hasNext()) {
            Student s = iterator.next();
            sum = sum + s.getTotalMarks();
            count++;
        }
        int averagemarks = sum / count;
        Iterator<Student> iterator1 = studentSet.iterator();
        // ?If I am use iterator than second test case note passed. dont know why?
        while (iterator1.hasNext()) {
            Student s = iterator1.next();
            result.put(s.getName(), averagemarks);
        }
        return result;
        // Use getter method to get TotalMarks of each student. calculate the average

        // add the student name and average marks in the HashMap object created in the
        // first line and return the map

    }

    public static void main(String[] args) {
        Set studentName = getAllStudentData();
        System.out.println(getAllStudentNameInSorted(studentName));
        System.out.println(calculateAverage(studentName));
    }

}
