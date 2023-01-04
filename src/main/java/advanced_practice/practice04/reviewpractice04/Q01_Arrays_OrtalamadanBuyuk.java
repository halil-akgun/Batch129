package advanced_practice.practice04.reviewpractice04;

public class Q01_Arrays_OrtalamadanBuyuk {
    public static void main(String[] args) {

        //Verilen bir Array'in elementlerinin ortalamasından büyük elementleri yazdıran bir kod yazınız.
        int[] arr = {5, 9, 15, 1, 0, 11, 3};
        int sum = 0;
        for (int w : arr) {
            sum += w;
        }
        double average = (double) sum / arr.length;
        System.out.printf("average = " + "%.2f", average);
        System.out.println();
        System.out.print("larger than average numbers: ");
        for (int w : arr) {
            if (w > average) {
                System.out.print(w + " ");
            }
        }
    }
}