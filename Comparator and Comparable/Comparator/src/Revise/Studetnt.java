package Revise;

import java.util.Comparator;

public class Studetnt implements Comparable<Studetnt> {

    int rollNo;
    int marks;
    String name;

    public Studetnt(int rollNo, int marks, String name) {
        this.rollNo = rollNo;
        this.marks = marks;
        this.name = name;
    }

    public int compareTo(Studetnt s) {
        if (this.rollNo == s.rollNo) {
            return 0;
        }
        if (this.rollNo < s.rollNo) {
            return -1;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Studetnt [rollNo=" + rollNo + ", marks=" + marks + ", name=" + name + "]";
    }

}
