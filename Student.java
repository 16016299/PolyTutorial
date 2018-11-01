package PolyTutorial;

public class Student {
    private String studentName;
    int studentNumber;
    private int studentAge;
    private boolean studentPassed;


    public Student(String name, int number, int age, boolean pass){//basic constructor
        studentName = name;
        studentNumber = number;
        studentAge = age;
        studentPassed = pass;
    }

    public String getName(){
        return studentName;
    }

    public void displayDetails(){
        System.out.println("Student name:"+studentName);
        System.out.println("Student number:"+studentNumber);
        System.out.println("Student age:"+studentAge);
        System.out.println("did the student pass:"+studentPassed);
    }
}
