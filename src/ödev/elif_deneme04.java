package ödev;

import java.util.Scanner;

public class elif_deneme04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("string bir ifadegiriniz");
        String str =scan.nextLine();

        for (int i=0;i<str.length();i++){
            if (str.charAt(i)=='a' || str.charAt(i) == ' ') //burda if bady acmadık.

                continue;//döngü basa sarar. Braek ise kodu kırar calismaz

            System.out.println(str.charAt(i));
        }

    }
}
