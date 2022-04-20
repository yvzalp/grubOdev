package ödev;

import java.util.Scanner;

public class elif_deneme02 {

    public static void main(String[] args) {

        // kullanıcıdan taban ve üs al sonuc yazdır

        Scanner s = new Scanner(System.in);
        System.out.println("taban sayi giriniz");
        int sayi=s.nextInt();
        System.out.println("üs taban giriniz");
        int sayi1=s.nextInt();
        int sonuc=1;
        for(int i=0;i<sayi1;i++){

            sonuc *=sayi;
        }
        System.out.println(sonuc);

    }
}