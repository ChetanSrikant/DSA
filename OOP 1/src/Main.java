import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] rno = new int[5];
        String [] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

        Student chetan;
        chetan = new Student();

        chetan.rno = 9;
        chetan.marks = 99.9f;
        chetan.name = "Chetan Srikant";

        System.out.println(chetan.name);
        System.out.println(chetan.rno);
        System.out.println(Arrays.toString(students));

        Student arun = new Student();
        System.out.println(arun.rno);
    }


}

//for every student
class Student{
    int rno;
    String name;
    float marks;

    Student (){
        this (13,"default Student",100.0f);
    }
    Student (int rno, String name, float marks){
        this.rno = rno;
        this.marks = marks;
        this.name = name;
    }
}