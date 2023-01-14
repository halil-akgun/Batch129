package day25inheritiance;

public class Car extends Vehicle {
    public int price = 11000;
    public Car() {
        super(22000);
        System.out.println("car");
    }

    public Car(String make) {
        //this();
        System.out.println("Car 2: " + make);
    }
    public void engine(){
        System.out.println("car engine");
    }
}
