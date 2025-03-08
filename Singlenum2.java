package LeetCodeGfg;

public class Singlenum2 {
    public static void main(String[] args) {
        int []nums={5,6,5,5};
        System.out.println(single(nums));
    }
    static int single(int[]nums){
        int a=0;
        int b=0;
        for(int i=0;i<nums.length;i++){
            a=(a^nums[i]) & (~b);
            b=(b^nums[i]) &(~a);
        }
        return a;
    }
}
