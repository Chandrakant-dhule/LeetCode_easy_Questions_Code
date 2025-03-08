package LeetCodeGfg;

import java.util.Arrays;

public class MejorityElement {
    public static void main(String[] args) {
        int []nums={3,3};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
     int max=0;
        Arrays.sort(nums);

        int maxrep=-1;
     for(int i=1;i< nums.length;i++){
         int count=1;
             if(nums[i]==nums[i-1]){
                 count++;
             }
             if(count>max){
                 max=count;
                 maxrep=nums[i-1];
             }
         }
     return  maxrep;
    }
}
