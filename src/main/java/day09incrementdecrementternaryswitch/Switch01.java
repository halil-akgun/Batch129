package day09incrementdecrementternaryswitch;

public class Switch01 {
    public static void main(String[] args) {

        // kaçıncı gün
        String day = "suNday";

        // 1. yol
        if (day.equalsIgnoreCase("sunday")) {
            System.out.println(1);
        } else if (day.equalsIgnoreCase("monday")) {
            System.out.println(2);
        } else if (day.equalsIgnoreCase("tuesday")) {
            System.out.println(3);
        } else if (day.equalsIgnoreCase("wednesday")) {
            System.out.println(4);
        } else if (day.equalsIgnoreCase("thursday")) {
            System.out.println(5);
        } else if (day.equalsIgnoreCase("friday")) {
            System.out.println(6);
        } else if (day.equalsIgnoreCase("saturday")) {
            System.out.println(7);
        } else {
            System.out.println("geçerli bir gün ismi girin.");
        }

        // 2. yol
        switch (day.toLowerCase()) {
            case "sunday":
                System.out.println(1);
                break;
            case "monday":
                System.out.println(2);
                break;
            case "tuesday":
                System.out.println(3);
                break;
            case "wednesday":
                System.out.println(4);
                break;
            case "thursday":
                System.out.println(5);
                break;
            case "friday":
                System.out.println(6);
                break;
            case "saturday":
                System.out.println(7);
                break;
            default:
                System.out.println("geçerli bir gün ismi girin.");
        }

    }
}
