//Create vote class inside the package com.election
package com.election;

public class Voter {
    private String name;
    private int age;
    // Set voter eligible age as final which can't be change
    static final int VOTER_ELIGIBLE_AGE = 18;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    // Non-Arugment Constructor
    public String Voter() {
        // Getting age through getter of Age private variable and compare it with final
        // variable
        if (getAge() >= VOTER_ELIGIBLE_AGE) {
            return name + " Is Eligible to Vote";
        } else if (getAge() > 0 && getAge() < VOTER_ELIGIBLE_AGE) {
            return name + " Is Not Eligible to Vote";
        } else {
            return "Age Can't Be Negative or Zero";
        }
    }

}
