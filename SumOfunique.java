package LeetCodeGfg;

public class SumOfunique {
    public static void main(String[] args) {
        int [] arr={2,2,3,4,5};
        System.out.println(sumOfUnique(arr));
    }
    public static int sumOfUnique(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            boolean flag=true;
            for(int j=0;j<nums.length;j++){
                if(i!=j && nums[i]==nums[j]){
                    flag=false;
                    break;
                }
            }
            if(flag){
                sum=sum+nums[i];
            }
        }
        return sum;
    }
}
