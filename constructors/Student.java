public class Student {

    String name = "spongebob";
    int age;
    double gpa;
    boolean isEnrolled;

    Student(String name, int age , double gpa){
           this.name = name;
           this.age = age;
           this.gpa = gpa;
           this.isEnrolled = true;
    }

    void studing(){
        System.out.println(this.name + " is studing.");
    }
}


