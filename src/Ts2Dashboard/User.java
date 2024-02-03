package Ts2Dashboard;
import java.text.DecimalFormat;
import java.util.Scanner;


public class User {
    private String isim;
    private DropOrani[] dropOranlari;

    public User(String isim, DropOrani[] dropOranlari) {
        this.isim = isim;
        this.dropOranlari = dropOranlari;
}
    public void dropSonuclariGoruntule() {
        System.out.println("Kullanıcı: " + isim);
        System.out.println("Drop Sonuçları:");

        int toplamAdet = 0;

        for (DropOrani dropOrani : dropOranlari) {
            toplamAdet += dropOrani.getAdet();
        }

        DecimalFormat df = new DecimalFormat("#0.0");

        for (DropOrani dropOrani : dropOranlari) {
            double oran = ((double) dropOrani.getAdet() / toplamAdet) * 100;
            System.out.println(dropOrani.getTur() + ": %" + df.format(oran));
        }
    }
}