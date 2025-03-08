package LeetCodeGfg;

import java.util.Arrays;

public class Removeduplicate {
    public static void main(String[] args) {
        int []arr={5,5,5,2,2,3,4};

//        for(int i=0;i<arr.length;i++){
//            for(int j=1;j< arr.length-i;j++){
//                if(arr[j-1]>arr[j]){
//                    int temp=arr[j];
//                    arr[j]=arr[j-1];
//                    arr[j-1]=temp;
//                }
//            }
//        }
        //Arrays.sort(arr);
        //System.out.println(duplicate(arr));
        int nums=duplicate(arr);
        System.out.println(Arrays.toString(Arrays.copyOf(arr,nums)));
    }
    static int duplicate(int[]arr){
        int k=2;
        for(int i=1;i< arr.length;i++){
            if(arr[i]!=arr[k-2]){
                arr[k]=arr[i];
                k++;
            }
        }
        return k;
    }
}
