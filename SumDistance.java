package LeetCodeGfg;

import java.util.Arrays;

public class SumDistance {
    public static void main(String[] args) {
        int[] nums={1,3,1,1,2};
        System.out.println(Arrays.toString(distance(nums)));
    }
    public static long[] distance(int[] nums) {
        long[]arr=new long[nums.length];
        int k=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=0;j<nums.length;j++){
                if(i!=j && nums[i]==nums[j])
                {
                    sum+=Math.abs(i-j);

                }
            }
            arr[k] = sum;
            k++;
        }
        return arr;
    }
}
