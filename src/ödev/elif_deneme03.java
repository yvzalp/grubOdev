package ödev;

import java.util.ArrayList;
import java.util.Arrays;

public class elif_deneme03 {
    public static void main(String[] args) {

        // input:String str ="javaisalsoeasy"
        //output:[a,s]

        String str = "javaisalsoeasy";

        char[] arr = str.toCharArray();

        System.out.println(Arrays.toString(arr));

        ArrayList<Character> output = new ArrayList<>();

        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j] && !output.contains(arr[j])){
                    System.out.println(arr[j]);
                    output.add(arr[j]);
                }
            }
        }
        System.out.println(output);


    }
}
