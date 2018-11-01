package PolyTutorial;

import java.util.Scanner;

public class UNIT {
    private String code;
    private String title;
    private Student classList[] = new Student[10];
    private String input;
    private boolean found;

    public UNIT(String unos, String utitle)
    {
        code = unos;
        title = utitle;
    }

    public void display(){//displays details of all students in class
        System.out.println("Class - "+title);
        for(int counter = 0; counter < classList.length; counter++){
            System.out.println("Student slot:"+counter);
            if(classList[counter]==null){
                System.out.println("slot empty");
            }
            else{
                classList[counter].displayDetails();
            }
        }
    }

    public void addStudent(Student temp)//finds free slot in array and adds student to it
    {
        boolean space = false;
        for (int x=0; x<classList.length;x++)
        {
            if (classList[x]==null)
            {
                classList[x] = temp;
                space = true;
                break;
            }
        }
        if (space==true) System.out.println("Student inserted");
        else System.out.println("No space avaliable");
    }

    public void findStudent(){//locates any students with entered name
        found = false;
        Scanner kboard = new Scanner(System.in);
        System.out.println("please enter the name of the student you would like to find");
        input = kboard.next();
        for(int counter = 0; counter < classList.length; counter++){
            String name = classList[counter].getName();
            if(name.equalsIgnoreCase(input)){
                classList[counter].displayDetails();
                found = true;
            }
            if(found = false){
                System.out.println("no student found with that name");
            }
        }

    }

}
