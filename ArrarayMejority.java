package LeetCodeGfg;

import java.util.Arrays;

public class ArrarayMejority {
    public static void main(String[] args) {
        int[]arr={3,3,6,7,7,3,3,3};
        int n = arr.length;
        int min= n / 2;
        Arrays.sort(arr);
        int count=1;
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1]){
                count++;
            }
            else{
                if(count>min) {
                    System.out.println(arr[i - 1] );
                    return;
                }
                    count = 1;

            }
        }
        if (count > min) {
            System.out.println(arr[n - 1]);
        }
    }
}
