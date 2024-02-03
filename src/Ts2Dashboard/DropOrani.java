package Ts2Dashboard;
import java.util.Scanner;
import java.text.DecimalFormat;



public class DropOrani {
    private String tur;
    private int adet;

    public DropOrani(String tur, int adet) {
        this.tur = tur;
        this.adet = adet;
    }

    public String getTur() {
        return tur;
    }

    public int getAdet() {
        return adet;
    }
}
