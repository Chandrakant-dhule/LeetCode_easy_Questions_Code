package LeetCodeGfg;

import java.util.ArrayList;
import java.util.Arrays;

public class Removeduplicate2 {
    public static void main(String[] args){
        int []arr={1,1,2,2,3,4};
        System.out.println(duplicate(arr));
    }
    static ArrayList<Integer> duplicate(int[]arr){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i< arr.length-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                list.add(arr[i]);
            }
        }
//        if(arr[arr.length-1] != arr[arr.length-2])
//        {
//            list.add(arr[arr.length-1]);
//        }
        return list;
    }

}
