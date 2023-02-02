package z_interfaceChildinBaskaParentindeOverrideEdilmis;

public class C extends B implements A{
    public static void main(String[] args) {
        A a = new C();
        a.myMethod();
    }
    // bir child classin hem parent classi hem de parent interfacei olabilir.
    // interfacede bir metod olsa, bu metod parent classta bodyli olsa childin
    // interfacedeki metodu override etme zorunlulugu ortadan kalkar
    // cunku child class interfacedeki metodun overrride edilmis haline parent
    // classindan dolayi sahiptir.

//    @Override   // child class parenttan myMethod metodunu barindirdigi icin
//    interface daki myMethod metodunu override etme zorunlulugu ortadan kalti
//    public void myMethod() {
//        System.out.println("bbb");
//    }
}
