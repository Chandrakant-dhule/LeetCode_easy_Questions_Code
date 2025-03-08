package LeetCodeGfg;

import java.util.Arrays;

public class ReplaceMax {
    public static void main(String[] args) {
        int [] arr={17,18,5,4,6,1};
       arr= replaceElements(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] replaceElements(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int max=0;
            for(int j=i+1;j<arr.length;j++){
                if(max<arr[j]){
                    max=arr[j];
                }
            }
            int temp=arr[i];
            arr[i]=arr[max];
            arr[max]=temp;
        }
        return arr;
    }
}
