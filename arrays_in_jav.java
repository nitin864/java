import java.util.Arrays; 

class Main {
    public static void main(String[] args) {
        
        String fruits[] = {"apple", "banana" , "oranges" ,"pineapple"};
        //fruits[1] = "fab";
        
        //int numOfFruits = fruits.length;
        
        //for(int i = 0 ; i < fruits.length ; i++){
        //    System.out.println(fruits[i]);
        //    System.out.print(fruits[i] + " ");
        //}
        
        //System.out.println("********************************");
        
        //enhanced for loops
        //for(String fruit : fruits){
        //    System.out.print(fruit + " ");
        //}
        
        //array sorting
        Arrays.sort(fruits); 
        Arrays.fill(fruits , "coconut");  //array fill method
        
        
        //just to see the sorted result
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }

        //System.out.println(fruits[1]);
        //System.out.print(numOfFruits);
    }
}
