package LeetCodeGfg;
import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int nums[]={-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        if(nums==null || nums.length<3) return new ArrayList<>();
        Arrays.sort(nums);
        Set<List<Integer>>list=new HashSet<>();
        for(int i=0;i<nums.length-2;i++)
        {
            int s=i+1;
            int e=nums.length-1;
            while(s<e)
            {
                int sum=nums[i]+nums[s]+nums[e];
                if(sum==0)
                {
                    list.add(Arrays.asList(nums[i], nums[s], nums[e]));
                    s++;
                    e--;
                }
                else if(sum<0)
                {
                    s++;
                }
                else
                {
                    e--;
                }
            }
        }
        return new ArrayList<>(list);
    }
}
