//polymorphism
class Husband{
    void role(){
        System.out.println("I am also a Husband");
    }
}

class Father extends Husband{
    @Override
    void role(){
        System.out.println("I am a father, I take care of my family");
    }
}

public class Main {
    public static void main(String[] args){
        Husband p = new Father(); //upcasting
        p.role(); //runtime polymorphism
    }
}
