package day26overriding;

public class Cat extends Mammal {
    public void meow() {
        System.out.println("Cats meow...");
    }


    @Override // Override kurallarının java tarafından kontrol edilmesini sağlar
    public void eat() { // childda Override edilmiş bu methoda Overriding method denir
        System.out.println("Cats eat...");
    }


    @Override // Override Annotation
    public void drink() {
        System.out.println("cats drink...");
    }

    @Override
    public Animal create() {
        return new Cat();
    }

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public Integer multiply(int a, int b) {
        return a * b;
    }
}
