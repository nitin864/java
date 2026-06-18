//type casting ias a way to convert a variable from one data type to another. In Java, 
//there are two types of type casting: 

//implicit casting (also known as widening) 

//and explicit casting (also known as narrowing).

public class Main{
    public static void main(String[] args){
        //implicit type casting
        int  m = 7;
        long n = m; //implicit type casting

        System.out.println("Implicit type casting: " + n);

        //explicit type casting
        double x = 9.78;
        int y = (int) x; //explicit type casting

        System.out.println("Explicit type casting: " + y);
    }
}
