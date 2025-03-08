package LeetCodeGfg;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int []arr={9,9,9};
        System.out.println(Arrays.toString(plusone(arr)));
    }
    static int[] plusone(int []arr){
        for(int i= arr.length-1;i>=0;i--){
            if(arr[i]==9)
            {
                arr[i]=0;
            }
            else
            {
                arr[i]++;
                return arr;
            }
        }
        arr=new int[arr.length+1];
        arr[0]=1;
        return arr;
    }
}
