package LeetCodeGfg;

public class NegetivePositive {
    public static void main(String[] args) {
        int[] nums={-3,-2,-1,0,0,1,2};
        System.out.println(maximumCount(nums));
    }
    public static int maximumCount(int[] nums) {
        int count=0;
        int out=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                count++; // 1 2
            }
            else if(nums[i]<0){
                out++; //1 2 3
            }
        }
        return Math.max(count,out);
    }
}
