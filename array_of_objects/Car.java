
public  class Car {
    String model;
    String color;

    Car(String model , String color){
        this.model = model;
        this.color = model;
    }

    void drive(){
        System.out.println("you drive a " + this.model + " of color " + this.color);
    }
}
