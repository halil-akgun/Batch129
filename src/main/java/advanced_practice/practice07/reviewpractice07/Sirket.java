package advanced_practice.practice07.reviewpractice07;

public class Sirket {
    static int kasa;
    int depButcesi;


    public void kasadanButceyeParaAl(int alinacakPara) {
        depButcesi += alinacakPara;
        kasa -= alinacakPara;
        System.out.println("Kasadan " + alinacakPara + " lira alındı");
    }

    public void paraKazan(int kazanilanPara) {
        kasa += kazanilanPara;
        System.out.println(kazanilanPara + " lira kazanıldı.");
    }

    public static void kasadanParaHarca(int harcanacakPara) {
        kasa -= harcanacakPara;
        System.out.println("kasadan " + harcanacakPara + " lira harcandı.");
    }

    public void departmanHarcamasi(int harcanacakPara) {
        depButcesi -= harcanacakPara;
        System.out.println("departman bütçesinden " + harcanacakPara + " lira harcandı.");
    }

}
