package ödev;


import java.util.ArrayList;
import java.util.List;


public class iterator_deneme01 {
    public static void main(String[] args) {
        /*

        List<Integer> liste= new ArrayList<>();

        liste.add(5);
        liste.add(2);
        liste.add(4);
        liste.add(8);
        liste.add(9);

        System.out.println(liste);

        Iterator itr = liste.iterator();

        System.out.println(itr.hasNext());//yanında element varmı true dondurur
        System.out.println(itr.next());// 5
        System.out.println(itr.next());// 2
        System.out.println(itr.next());// 4
        itr.remove();// üst üste iki defa remove kullanılamaz.
        System.out.println(liste);

         */

        //verilen listedeki her elementi 3 artiralim
        /*

        List<Integer> liste= new ArrayList<>();

        liste.add(5);
        liste.add(2);
        liste.add(4);
        liste.add(8);
        liste.add(9);


        ListIterator itr= liste.listIterator();

        while (itr.hasNext()){

            Object sayi =itr.next();
            itr.set((Integer)sayi+3);

        }
        System.out.println(liste);

         */

        // Listeyi tersten yazdirma
        /*

        List<Integer> liste= new ArrayList<>();

        liste.add(5);
        liste.add(2);
        liste.add(4);
        liste.add(8);
        liste.add(9);

        ListIterator itr = liste.listIterator();

        while(itr.hasNext()){
            itr.next();
        }
        while(itr.hasPrevious()){
            System.out.print(itr.previous()+" ");
        }

         */

        // soru belli araligin dısında kalan elementleri sil
        //2.liste olusturmadan gecerli liste uzerinden yap

        List<Integer> liste= new ArrayList<>();

        liste.add(2);
        liste.add(13);
        liste.add(56);
        liste.add(23);
        liste.add(45);
        liste.add(14);
        liste.add(40);

       // listIterator itr = liste.listIterator(); // kabul etmedi sor? kızarıklıklar neden oldu sor.

       // while(itr.hasNext()){
        //    Object sayi = itr.next();
        //    if((Integer)sayi<=20 || (Integer)sayi>=40){
        //        itr.remove();



      //  System.out.println(liste);






    }



}
