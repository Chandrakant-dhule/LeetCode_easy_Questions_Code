package LeetCodeGfg;

public class EvenNumDigit {
    public static void main(String[] args) {
        int[] nums = {12};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int x=0;
        for(int i=0;i<nums.length;i++)
        {   int rem=0;
            int count=0;
            while(nums[i]!=0){
                rem=nums[i]%10;
                count++;
                nums[i]=nums[i]/10;
            }
            if(count%2==0){
                x++;
            }
        }
        return x;
    }
}
