package Ts2Dashboard;
import java.util.Scanner;
import java.text.DecimalFormat;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dropTurleri = {"Gök sandığı drobu", "Toprak sandığı drobu", "Cp drobu", "Binek drobu", "Boş drop"};

        System.out.print("Kullanıcının ismini giriniz: ");
        String kullaniciIsim = scanner.nextLine();

        DropOrani[] dropOranlari = new DropOrani[dropTurleri.length];

        for (int i = 0; i < dropTurleri.length; i++) {
            System.out.print(dropTurleri[i] + " için adet giriniz: ");
            int adet = scanner.nextInt();
            dropOranlari[i] = new DropOrani(dropTurleri[i], adet);
        }

        User user = new User(kullaniciIsim, dropOranlari);
        user.dropSonuclariGoruntule();
    }
}
