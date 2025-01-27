package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StudentInfo studentTwo = new StudentInfo(
                "John",
                "Smith",
                2,
                17,
                2002
        );

        System.out.println(studentTwo);
        StudentInfoRecord coolStudent = new StudentInfoRecord(
                "Nathan",
                "Russell",
                3,
                20,
                1990
        );
        System.out.println(coolStudent);

    }
}