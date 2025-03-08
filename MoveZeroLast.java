package LeetCodeGfg;

import java.util.Arrays;

public class MoveZeroLast {
    public static void main(String[] args) {
        int []arr={2,5,7,0,4,0,7,-5,8,0};
       int s=0;
       int e= arr.length-1;
       while(s<e){
           if(arr[s]==0 && arr[e]!=0){
               int temp=arr[e];
               arr[e]=arr[s];
               arr[s]=temp;
               s++;
               e--;
           }
           else if(arr[s]==0 || arr[e]==0) {
               e--;
           }
           else if(arr[e]!=0 || arr[s]!=0){
               s++;
           }

       }
        System.out.println(Arrays.toString(arr));

        }
    }
