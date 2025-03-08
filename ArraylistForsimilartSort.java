package LeetCodeGfg;
import java.util.*;
import java.util.ArrayList;

public class ArraylistForsimilartSort {
    public static void main(String[] args) {
        int[]nums={4,3,2,3,1};
        int target=4;
        System.out.println(targetIndices(nums,target));
    }
    public static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
                list.add(i);
            }
        }
        return list;
    }
}

