package abstractclass;

import javax.security.auth.Subject;

abstract class Student {
    String fullName;

    public void printName() {
        System.out.println(fullName + " is my full name");
    }

    //creation of abstract method
    public abstract void program();

}


interface Subjects{

    public abstract void listOfSubjects();
    public abstract void creditHours();

}


//child class of Student class
class GraduateStudent extends Student implements Subjects{


    @Override
    public void program() {
        System.out.println("Student is enrolled to Computer Science program");
    }

    @Override
    public void listOfSubjects() {
        String [] subjects = {"History", "Math", "English"};
        System.out.println(subjects[0]);
        System.out.println(subjects[1]);
        System.out.println(subjects[2]);
    }

    @Override
    public void creditHours() {
        String [][] subjectsAndCH = {{"History", "4 creditHours"},
                {"Math", "4 creditHours"},
                {"English", "2 creditHours"}};

        // first [] has 3 obj
        //seconds [] has 2 obj

        for(int i = 0; i < subjectsAndCH.length; i++){
            for(int j = 0; j < subjectsAndCH.length-1; j++){
                System.out.println(subjectsAndCH[i][j]);
            }
        }

    }

    public static void main(String[] args) {

        GraduateStudent gs = new GraduateStudent();
        gs.program();
        gs.listOfSubjects();
        gs.creditHours();
    }

    }
