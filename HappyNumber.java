package LeetCodeGfg;

public class HappyNumber {
    public static void main(String[] args) {
        int n=70;
        System.out.println(happy(n));
    }
    public static boolean happy(int n){
        int rem;
        int count=0;
        while(count<=100){
            int sum=0;
            while(n!=0){
                rem=n%10;
                sum=sum+rem*rem;
                n=n/10;
            }
            if(sum==1){
                return true;
            }
            n=sum;
            count++;
        }
        return false;
    }
}
