package LeetCodeGfg;

import java.util.Arrays;

public class ArraysinParity {
    public static void main(String[] args) {
        int []nums={3,1,2,4};
        int []arr=sortArrayByParity(nums);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] sortArrayByParity(int[] nums) {
        int s=0;
        int e=nums.length-1;
        while(s<e){
            if (nums[s] % 2 == 0) {
                s++;
            }
            else if (nums[e] % 2 != 0){
                e--;
            }
            else{
                int temp=nums[s];
                nums[s]=nums[e];
                nums[e]=temp;
                s++;
                e--;
            }
        }
        return nums;
    }
}
