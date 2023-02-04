package practice;

public interface B extends A{
    @Override
    default void a(){
        System.out.println("aaa");
    }
}
