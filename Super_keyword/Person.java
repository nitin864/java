public class Person {

    String first;
    String last;

    Person( String first , String last){
        this.first = first;
        this.last = last;

    }
    void showPerson (){
        System.out.println("The name is " + this.first  + " " + this.last);
    }


}

