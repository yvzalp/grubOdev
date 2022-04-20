package ödev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ödev02 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("lutfen bir metin giriniz : ");
        String cumle=scan.nextLine();
        System.out.print("Lutfen silmek istediginiz karakteri giriniz :");
        String silKarakter=scan.next();
        karakterSil(cumle,silKarakter);
    }
    private static void karakterSil(String cumle, String silKarakter) {
        List<String> karakter=new ArrayList<>(Arrays.asList(cumle.split(" ")));
        for (int i = 0; i <karakter.size() ; i++) {
            if (silKarakter.equals(karakter.get(i))){
                karakter.remove(i);
            }
        }
        for (int i = 0; i <karakter.size() ; i++) {
            System.out.print(karakter.get(i));
        }



    }
}
