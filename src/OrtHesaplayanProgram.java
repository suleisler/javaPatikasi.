import java.util.Scanner;

public class OrtHesaplayanProgram {
    public static void main(String[] args) {
        int mat, fizik, turkce, tarih, muzik;

        Scanner ders= new Scanner(System.in);

        System.out.print("Matematik Notu:");
        mat=ders.nextInt();

        System.out.print("Fizik notu:");
        fizik=ders.nextInt();

        System.out.print("Türkçe Notu:");
        turkce=ders.nextInt();

        System.out.print("Tarih Notu:");
        tarih= ders.nextInt();

        System.out.print("Müzik Notu:");
        muzik= ders.nextInt();


        int toplam=(mat+fizik+turkce+tarih+muzik);
        Double ortalama= toplam/5.0;
        System.out.println(ortalama);

        boolean sinifiGecti = ortalama >= 45;

        System.out.println("Ortalama: " + ortalama);



        if (sinifiGecti) {
            System.out.println("Sınıfı Geçti");
        } else {
            System.out.println("Sınıfta Kaldı");
        }
    }
}
