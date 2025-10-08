import java.sql.SQLOutput;

class Main {
    public static void main(String[] args) {

    Person person = new Person("nitin", "raj");
    Student student = new Student("shubham ", "singh", 9.5);
    Employe employe = new Employe("ashish" , "alok" ,999999);

    person.showPerson();
    System.out.println(student.gpa);
    student.showPerson();
    student.showgpa();
    employe.showSalary();

    }


}
