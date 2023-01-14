package day25inheritiance;

public class Honda extends Car {
    public int price = 10000;
    public Honda() {
        //this("r8", 2023);
        System.out.println("honda");
    }

    public Honda(String model, int year) {
        //super("Honda1"); // super yazmasanızda aynı işi görür (parametre koyulmayacaksa)
        System.out.println("honda 2: " + model + "-" + year);
    }
    public void engine(){

        System.out.println("vehice engine");
    }
}
