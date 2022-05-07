package ödev01;

import java.util.HashSet;

public class hasSet01 {

    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        int arr[]={1,2,4,8,3,6,7,9,};

        cevir(hs,arr);


    }

    private static void cevir(HashSet<Integer> hs, int[] arr) {

        for (Integer sayi:arr) {
            hs.add(sayi);
        }yazdir(hs);

    }

    private static void yazdir(HashSet<Integer> hs) {

        for (Integer s:hs) {

            System.out.print(s+" ");

        }

    }
}
