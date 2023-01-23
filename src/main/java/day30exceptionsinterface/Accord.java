package day30exceptionsinterface;

public class Accord implements Ac, Engine, Security {

    @Override
    public void cool() {
        System.out.println("accord cool");
    }

    @Override
    public void run() {
        System.out.println("accord run");
    }
}
