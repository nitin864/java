import java.sql.SQLOutput;

class Main {
    public static void main(String[] args) {

        Student  student1 = new Student("nitin" , 19 , 9.5);
        Student student2 = new Student("shubh" , 20 , 9.8);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);

        student1.studing();
        student2.studing();
    }


}
