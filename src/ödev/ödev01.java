package ödev;

import java.util.Scanner;

public class ödev01 {


    public static void main(String[] args) {



        /*
    Bir sayıyı ters çeviren ve yazdıran method create ediniz

    Örnek:
    output:
    Bir sayı giriniz: 12345
    Girdiğiniz sayının ter çevrilmiş hali: 54321
     */

            Scanner scan = new Scanner(System.in);

            System.out.print("Bir sayi giriniz: ");
            int sayi = scan.nextInt();


            sayininTersi(sayi);

        }

    public static void sayininTersi(int sayi) {


        while(sayi>0){

            int tersten =sayi%10;

            System.out.println(tersten);

            sayi /=10;

        }System.out.print("");






    }















    }











