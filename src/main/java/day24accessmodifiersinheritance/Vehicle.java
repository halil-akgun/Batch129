package day24accessmodifiersinheritance;

public class Vehicle {
    public Vehicle() {
        /*
            child classtan bir obje oluşturduğunuzda constructorlar en üstteki
            parent classtan başlatılarak alta doğru çalıştırılır.
        */
        System.out.println("vehicle");
    }
}
