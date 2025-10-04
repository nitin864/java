import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
    
        
        String[][] mixed = {{"apple", "banana" , "pineapple"} ,{"BMW","Audi" , "Supra"} , {"Cow" , "Horse" ,"Dogs"}};
        
       System.out.println("This is the replacing part!!! here you can replace elements of an array by user input!!");
    
        System.out.print("Enter row: ");
        int rows = scanner.nextInt();
       
        System.out.print("Enter columns: ");
        int columns = scanner.nextInt(); 
        scanner.nextLine();
        
        System.out.print("Enter element: ");
        String data = scanner.nextLine();
        
         mixed [rows][columns] = data;  //to replace any columns and rows
        
        for(String[] items : mixed){
            for(String item : items){
                System.out.print(item + " ");
            }
            
             System.out.println();
        }
        
       scanner.close();
    }
}
