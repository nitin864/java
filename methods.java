import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       
       Scanner scanner  = new Scanner(System.in);
       
       double number;
       String choices;
       
       System.out.print("Press c to cube and s for square: ");
       choices = scanner.next().toUpperCase();
       
       if(choices.equals("C")){
          System.out.print("Enter Number to Cube: ");
          number = scanner.nextInt();
          System.out.print(cube(number));
       }else if(choices.equals("S")){
          System.out.print("Enter Number to Square: ");
          number = scanner.nextInt();
          System.out.print(square(number));
       }else{
           System.out.print("Enter a valid choice!!");
       }
         scanner.close();
    }
    
    static void happybirthday( String name , int age) {
        System.out.printf("Happy birthday %s!\n", name);
        System.out.printf("You are %d years old", age);
    }
    
    static double square(double number){
        return number * number;
    }
    
    static double cube(double number){
        return number * number * number;
    }
}
