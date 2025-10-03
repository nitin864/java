import java.util.Scanner;
class Main {
    public static void main(String[] args) {
         
         Scanner scanner = new Scanner(System.in);
         
         String[] cars; //here arrays are empty!!
         int size;
         
          System.out.print("Enter no of items to add in an array: ");
          size = scanner.nextInt();
          scanner.nextLine();
          
          cars = new String[size];
          
          
          for(int i = 0; i < cars.length ; i++){
              System.out.print("Enter cars brands to add in arrays: ");
              cars[i] = scanner.nextLine();
          }
          
         for(String car : cars){
             System.out.println(car);
         }
         
         scanner.close();
    }
}
