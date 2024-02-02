package ATM;

public class Base {
    public static void main(String[] args) {

    ATM atm = new ATM();

        Hesap hesap = new Hesap("Göktuğ Eren","200202",5000);
        atm.calis(hesap);
        System.out.println("Programdan çıkılıyor.");

    }
}