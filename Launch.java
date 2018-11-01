package PolyTutorial;


public class Launch {
    public static void main(String[] args){
        System.out.println("hiya");

        UNIT Unit1 = new UNIT("H123 D34", "object oriented programming");//declares students
        Student con = new Student("connor",1, 18, true);
        Student chaz = new Student("charlie",2, 21, true);
        Student jojo = new Student("joseph",3, 24, true);
        Student jim = new Student("James",4, 28, false);

        Unit1.addStudent(con);//adds students to array
        Unit1.addStudent(chaz);
        Unit1.addStudent(jojo);
        Unit1.addStudent(jim);

        Unit1.display();
        Unit1.findStudent();



    }
}
