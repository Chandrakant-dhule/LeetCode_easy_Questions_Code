package LeetCodeGfg;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int []nums={3,2,3,2,3,3,8};
        int val=3;
        System.out.println(remove(nums,val));
        int arr = remove(nums, val);
        System.out.println(Arrays.toString(Arrays.copyOf(nums,arr)));
    }
    static int remove(int[]nums,int val){
        int i=0;
        int k=0;
        while(i<nums.length){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
            i++;
        }
        return k;
    }
}
