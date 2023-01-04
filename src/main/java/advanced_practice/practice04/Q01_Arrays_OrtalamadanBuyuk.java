package advanced_practice.practice04;

public class Q01_Arrays_OrtalamadanBuyuk {
    public static void main(String[] args) {

        //Verilen bir Array'in elementlerinin ortalamasından büyük elementleri yazdıran bir kod yazınız.
        int[] arr = {5, 9, 15, 1, 0, 11, 3};
        double sum = 0;

        for (int w : arr) {
            sum += w;
        }
        double average = sum / arr.length;
        System.out.printf("average = "+"%.2f",average);
        System.out.println();

        System.out.print("ortalamadan büyük sayılar: ");
        for (int w : arr) {
            if (w > average) {
                System.out.print(w+" ");
            }
        }
    }
}