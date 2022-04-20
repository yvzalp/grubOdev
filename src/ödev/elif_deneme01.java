package ödev;

public class elif_deneme01 {

    public static void main(String[] args) {

        //soru;girdi AAABBBBCCCCC
        //cıktı      A3B4C5         SEKLİNDE YAZDİRALİM.

        String str ="AAABBBBCCCC";
        frekans(str);


        // DENEME BASARISIZ



    }

    private static void frekans(String str) {

        String output="";
        int sayac=0;
        for (int i=0;i<str.length();i++){

            for (int j =i;j<str.length()-1;j++){
                if (str.substring(i,i+1).equals(str.substring(j,j+1))){
                    sayac++;
                }if (!output.contains(str.substring(i,i+1))){
                    output +=str.substring(i,i+1)+sayac;
                }
            }
        }System.out.println(output);

    }
}
