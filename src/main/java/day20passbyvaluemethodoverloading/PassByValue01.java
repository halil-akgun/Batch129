package day20passbyvaluemethodoverloading;

public class PassByValue01 {
    public static void main(String[] args) {

        /*
        1- java passbyvalue sayesinde orijinal değerleri koruma altına alır.
         */
        double shirt = 100;
        discount("student", shirt);
        System.out.println("shirt = " + shirt); // 100

    }
    public static double discount(String state, double price){
        switch (state){
            case "student":
                price=price*0.9;
                break;
            case "veteran":
                price=price*0.8;
                break;
            case "senior":
                price=price*0.95;
                break;
            default:
                price=price;
        }
        return price;
    }
}
