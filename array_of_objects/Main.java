import java.sql.SQLOutput;

class Main {
    public static void main(String[] args) {

       /// Car car1  = new Car("BMW" , "black");  //another mathod 
       // Car car2 = new Car("audi" , "grey");
        //Car car3 = new Car("mustang" , "blue");

       // Car[] cars = {car1, car2, car3};

        Car[] cars = {new Car("mustang" , "red") , new Car("BMW" , "black")};

        for(Car car : cars){
            car.color = "saphire blue";
        }

        for(Car car : cars){
              car.drive();
        }




    }


}
