package day20passbyvaluemethodoverloading;

public class PassByValue02 {
    public static void main(String[] args) {

        String name = "Tom Hanks";
        updateName(name, " Jr.");
        System.out.println("updateName(name, \" Jr.\") = " + updateName(name, " Jr.")); // Tom Hanks Jr.
        System.out.println("name = " + name); // Tom Hanks

        name = updateName(name, " Jr.");
        System.out.println("name = " + name); // Tom Hanks Jr.

    }

    public static String updateName(String name, String add) {
        name += add;
        return name;
    }
}
