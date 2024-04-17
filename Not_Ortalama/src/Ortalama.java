import java.util.Scanner;

public class Ortalama {
    public static void main(String[] args) {
        int matematik, fizik, kimya, turkce, tarih, muzik, toplam;
        double ort;
        Scanner Not = new Scanner(System.in);
        System.out.println("Matematik Notunuzu Giriniz:");
        matematik = Not.nextInt();

        System.out.println("Fizik Notunuzu Giriniz:");
        fizik = Not.nextInt();

        System.out.println("Kimya Notunuzu Girin:");
        kimya = Not.nextInt();

        System.out.println("Türkçe Notunuzu Giriniz:");
        turkce = Not.nextInt();

        System.out.println("Tarih Notunuzu Giriniz:");
        tarih = Not.nextInt();

        System.out.println("Müzik Notunuzu Giriniz:");
        muzik = Not.nextInt();

        toplam = (matematik + turkce + tarih + muzik + kimya + fizik);
        ort = (double) toplam / 6;
        if (ort > 60){
            System.out.println("Ortalamanız:"+ort+ "Sınıfı Geçtiniz");
        } else if (ort < 60 ) {
            System.out.println("Ortalamanız: "+ort+" Sınıfta Kaldınız");
        }


    }
}

