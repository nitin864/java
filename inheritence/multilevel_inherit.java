class Vechile{
    void vec(){
        System.out.println("this is a vechile class");
    }
}

class Supercars extends Vechile{
    void supercar(){

        System.out.println("this is a supercars class");
    }
}

class Bmw extends Supercars{
    void bmw(){
        System.out.println("this is a bmw class and shows multilevel inheritence");
    }
}

public class Main{

    public static void main(String[] args) {
        
        Bmw m = new Bmw();

        m.bmw();
    }
}
