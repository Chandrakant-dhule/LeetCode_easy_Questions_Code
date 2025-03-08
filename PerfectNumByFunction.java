package LeetCodeGfg;

public class PerfectNumByFunction {
    public static void main(String[] args){
        int n=28;
        int i=1;
        int sum=0;
        System.out.println(strong(n,i,sum));
    }
    static boolean strong(int n,int i,int sum){
         if(i>=n)
            {
            return sum==n;
             }
            if(n%i==0)
            {
                sum=sum+i;
            }
        return strong(n,i=i+1,sum);
    }
}
