package LeetCodeGfg;

public class CountDigits {
    public static void main(String[] args) {
        int N=10818;
        System.out.println(evenlyDivides(N));
    }
    static int evenlyDivides(int N){
        int s=N;
        int count=0;
        int rem=0;
        while(N!=0){
            rem=N%10;
            if(rem!=0 && s%rem==0)
            {
                count++;
            }
            N=N/10;
        }
        return count;
    }
}
