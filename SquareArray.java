package LeetCodeGfg;

import java.util.Arrays;


public class SquareArray {
    public static void main(String[] args) {
        int []arr={4,5,3};
         sorted(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] sorted(int[]arr){
        int k=0;
        for(int i=0;i<arr.length;i++){
            arr[k]=arr[i]*arr[i];
           k++;
        }
        return sort(arr);
    }
    static int[] sort(int []arr){
      for(int i=0;i<arr.length;i++){
          for(int j=1;j<arr.length-i;j++){
              if(arr[j-1]>arr[j]){
                  int temp=arr[j];
                  arr[j]=arr[j-1];
                  arr[j-1]=temp;
              }
          }
      }
        return arr;
    }

}
