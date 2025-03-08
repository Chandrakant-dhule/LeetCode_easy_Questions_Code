package LeetCodeGfg;

public class Additon {
    public static void main(String[] args) {
        int n=25;
        System.out.println(seriesSum(n));
    }
    public static long seriesSum(int n) {
        int i=1;
        int sum=0;
        while(i<=n){
            sum=sum+i;
            i++;
        }
        return sum;
    }
}

