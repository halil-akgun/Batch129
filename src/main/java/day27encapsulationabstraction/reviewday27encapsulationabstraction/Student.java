package day27encapsulationabstraction.reviewday27encapsulationabstraction;

public class Student {

    private String id = "123";
    private boolean poor = true;

    public String getId (){
        return id;
    }

    public boolean isPoor() {
        return poor;
    }

    public void setId(String id2) {
        id = id2;
    }

    public void setPoor(boolean poor) {
        this.poor = poor;
    }
}
