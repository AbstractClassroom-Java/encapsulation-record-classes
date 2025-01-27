package org.example;

public class StudentInfo {
    private final String firstName;
    private final String lastName;
    private final int dobMonth;
    private final int dobDay;
    private final int dobYear;

    public StudentInfo(
            String firstName,
            String lastName,
            int dobMonth,
            int dobDay,
            int dobYear
    ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dobMonth = dobMonth;
        this.dobDay = dobDay;
        this.dobYear = dobYear;
    }

    public String firstName() {
        return this.firstName;
    }

    public String lastName() {
        return this.lastName;
    }

    public int dobMonth() {
        return this.dobMonth;
    }


    public int dobDay() {
        return this.dobDay;
    }

    public int dobYear() {
        return this.dobYear;
    }

    public String toString() {
        String info = "Student Information\n";
        info += "\tFirst Name: " + firstName + "\n"
                + "\tLast Name: " + lastName + "\n"
                + "\tDOB: " + dobMonth + "-" + dobDay + "-" + dobYear;
        return info;
    }
}
