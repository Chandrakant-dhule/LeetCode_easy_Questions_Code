package LeetCodeGfg;

import java.util.*;

public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        int[] nums1={2,2,4,4};
        int[] nums2={2,2,2,4,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++){
            result[i]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            result[nums1.length+i]=nums2[i];
        }
        Arrays.sort(result);
        double s=result[0];
        double e=result[result.length-1];
        double mid= s+(e-s)/2;
        return mid;
    }
}
