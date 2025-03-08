package LeetCodeGfg;

public class SinglleNumber {
    public static void main(String[] args) {
        int []nums={1,2,2,1,3};
        System.out.println(single(nums));
    }
    static int single(int[]nums){
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans=ans^nums[i];
        }
        return ans;
    }
}
