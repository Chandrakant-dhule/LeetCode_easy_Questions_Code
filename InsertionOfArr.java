package LeetCodeGfg;

import java.util.Arrays;

public class InsertionOfArr {
    public static void main(String[] args) {
        int []nums1 = {1,2,2,1};
        int [] nums2 = {2,2};
        System.out.println(intersection(nums1,nums2));
    }
    public static int intersection(int[] nums1, int[] nums2) {
        int k=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    nums1[k]=nums1[j];
                    k++;
                }
            }
        }
        return k;
    }
}
