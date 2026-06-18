//static variable and static method

//when a variable is declared to be static it means it shares among all instances of the class. It is not tied to any specific object, but rather belongs to the class itself. This means that if one instance of the class changes the value of a static variable, that change will be reflected across all instances of the class.

public class Main{
    static int a = 10; // static variable

    static void display(){ // static method
        System.out.println("Static method called");
    }
}
