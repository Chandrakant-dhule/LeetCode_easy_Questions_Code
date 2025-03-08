package LeetCodeGfg;

import java.util.Arrays;

public class SecondLarg {
    public static void main(String[] args) {
        int []arr={2,20};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int count=0;
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]!=arr[i-1]){
                count++;
            }

            if(count==1){
                System.out.println(arr[i-1]);
                break;
            }

        }
    }
}
