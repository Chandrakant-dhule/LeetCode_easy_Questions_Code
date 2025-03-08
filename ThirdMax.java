package LeetCodeGfg;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ThirdMax {
    public static void main(String[] args) {
        int [] nums={1,1,2};
        System.out.println(max(nums));
    }
    static int max(int [] nums){
        Arrays.sort(nums);
        int n= nums.length;
        int count=1;
        for(int i=n-1;i>=1;i--){
            if(nums[i]!=nums[i-1]){
                count++;
            }
            if(count==3){
                return nums[i-1];
            }
        }
        return nums[n-1];
    }
}
