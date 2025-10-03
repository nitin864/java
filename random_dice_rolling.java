// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
import java.util.Random;

class Main {
    public static void main(String[] args) {
           
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numOfDice;
        int total = 0;
        
        System.out.print("Enter no of dices to roll: ");
        numOfDice = scanner.nextInt();
        
        if(numOfDice > 0 ){
             
             for(int i = 0; i < numOfDice ; i++){
                int roll = random.nextInt(1, 7);
                showdice(roll);
                System.out.println("You have rolled " + roll);
                total = total + roll;
                
             }
            
            System.out.println("YOur total: " + total);            
            
        }else{
            System.out.print("No can't be less than zero!!");
        } 
        
        scanner.close();
    }
    
    static void showdice(int roll){
        
         String dice1 = """
               -------
              |       |
              |   *   |
              |       |
               -------
              """;

         String dice2 = """
               -------
              | *     |
              |       |
              |     * |
               -------
              """;

         String dice3 = """
               -------
              | *     |
              |   *   |
              |     * |
               -------
              """;

         String dice4 = """
               -------
              | *   * |
              |       |
              | *   * |
               -------
              """;

         String dice5 = """
               -------
              | *   * |
              |   *   |
              | *   * |
               -------
              """;

         String dice6 = """
               -------
              | *   * |
              | *   * |
              | *   * |
               -------
              """;
          
          switch(roll){
              case 1 -> System.out.print(dice1);
              case 2 -> System.out.print(dice2);
              case 3 -> System.out.print(dice3);
              case 4 -> System.out.print(dice4);
              case 5 -> System.out.print(dice5);
              case 6 -> System.out.print(dice6);
          }
          
    }
}
