package LeetCodeGfg;

public class SmallElementBinary {
    public static void main(String[] args) {
        int [] nums={1,2,3,4,5};
        System.out.println(findMin(nums));
    }
    public static int findMin(int[] nums) {
        int s=0;
        int e= nums.length-1;
        while(s<e){
            int mid=s+(e-s)/2;
            if(nums[mid]>nums[e]){
                s=mid+1;
            }
            else{
                e=mid;
            }
        }
        return nums[s];
    }
}
