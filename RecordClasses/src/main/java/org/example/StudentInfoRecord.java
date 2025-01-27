package org.example;

public record StudentInfoRecord(
        String firstName,
        String lastName,
        int dobMonth,
        int dobDay,
        int dobYear
) {
    public String toString() {
        String info = "Student Information\n";
        info += "\tFirst Name: " + firstName + "\n"
                + "\tLast Name: " + lastName + "\n"
                + "\tDOB: " + dobMonth + "-" + dobDay + "-" + dobYear;
        return info;
    }
}
