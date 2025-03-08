package LeetCodeGfg;

import java.util.Arrays;

public class Secondlargest {
    public static void main(String[] args) {
        int[]arr={12,12,34,8,19,16};
        Arrays.sort(arr);
        int k=3;
        int count=1;
        for(int i=0;i< arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                count++;
            }
            if(count==k){
                System.out.println(arr[i+1]);
            }
        }
    }
}
