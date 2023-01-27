package advanced_practice.practice11.interface_maas_hesapla;

public class MaasHesapla implements Vergi, MaasArtir {
    @Override
    public double yillikEkstra(int calismaYili) {
        return calismaYili * 100;
    }

    @Override
    public double saatlikEkstra(int calismaSaati) {
        return calismaSaati > 160 ? (calismaSaati - 160) * 10 : 0;
    }

    @Override
    public double vergi(int calismaYili, double brutMaas) {
        return calismaYili >= 10 ? brutMaas * 0.3 : brutMaas * 0.2;
    }

    public double netMaas(double brutMaas, int calismaYili, int calismaSaati) {
        return brutMaas + yillikEkstra(calismaYili) + saatlikEkstra(calismaSaati) - vergi(calismaYili, brutMaas);
    }
}
