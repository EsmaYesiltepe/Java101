import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Kdv_Hesapla {
    public static void main(String[] args) {
        double hesaplanacakTutar;
        int kdvOrani = 18;
        double kdvliTutar = 0;

        Scanner Tutar = new Scanner(System.in);
        System.out.println("Tutarı Giriniz: ");
        hesaplanacakTutar = Tutar.nextInt();

        if (hesaplanacakTutar > 0 & hesaplanacakTutar <= 1000) {

            kdvliTutar = (double) ((hesaplanacakTutar * kdvOrani)/100) + hesaplanacakTutar;
        } else if (hesaplanacakTutar > 1000) {

            kdvOrani = 8;
            kdvliTutar = (double) ((hesaplanacakTutar * kdvOrani)/100) + hesaplanacakTutar;
        }

        System.out.println("KDV'siz Fiyat: " +hesaplanacakTutar);
        System.out.println("KDV'li Fiyat: " +kdvliTutar);
        System.out.println("KDV Tutarı: " + kdvOrani);

    }

}
