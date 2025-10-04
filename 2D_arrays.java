 
///creating a 2d matrix


class Main {
    public static void main(String[] args) {
        
        String[][] mixed = {{"apple", "banana" , "pineapple"} ,{"BMW","Audi" , "Supra"} , {"Cow" , "Horse" ,"Dogs"}};
        
        mixed [1][2] = "rangeRover";  //to replace any columns and rows
        
        for(String[] items : mixed){
            for(String item : items){
                System.out.print(item + " ");
            }
            
             System.out.println();
        }
        
       
    }
}
