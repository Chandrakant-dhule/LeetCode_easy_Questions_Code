package LeetCodeGfg;

public class MisingNumber {
    public static void main(String[] args) {
        int []arr={1,2,3,5};
        System.out.println(num(arr));
    }
    public static int num(int[]arr){
//        int sum=0;
//        int act;
//        int n=arr.length+1;
//        int s;
//        for(int i=0; i < arr.length;i++){
//               sum= sum+arr[i];
//            }
//            act=(n*(n+1))/2;
//            s=act-sum;
//         return s;

        int sum=0;
        int sum1=0;
        for(int i=0;i<=arr.length+1;i++){
            sum=sum^i;
        }
        for(int n:arr){
            sum1=sum1^n;
        }
        return sum^sum1;
        }
}