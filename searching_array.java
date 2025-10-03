import java.util.Scanner;
class Main {
    public static void main(String[] args) {
         
        Scanner scanner = new Scanner(System.in); 
         
        int[] numbers = {1,2,3,4,5,6,7,8};
        String[] cars = {"bmw" , "audi" , "toyota"};
        int target;
        String target2="";
        boolean isFound = false;
        
        System.out.print("Enter element to search in array: ");
        target2 = scanner.nextLine();
        
        for(int  i = 0 ; i < cars.length; i++){
            if(cars[i].equals(target2)){
                System.out.print("Element found at index: " + i);
                isFound = true;
                break;
            }
        }
        
        if(!isFound){
            System.out.print("Element not found in array!!");
        }
         
        scanner.close(); 
       
    }
}
