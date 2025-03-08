package LeetCodeGfg;

public class PAlindrome {
    public static void main(String[] args) {
        //int x=-121
        int x=121;
        System.out.println(inpalindrome(x));
    }
    public static boolean inpalindrome(int x){
//       // String s=String.valueOf(x);
//        for(int i=0;i<x.length()/2;i++){
//            if(x.charAt(i)!=x.charAt(x.length()-1-i)){
//                return false;
        if(x<0){
            return false;
        }
        int s=x;
        int sum=0;
        while(x!=0){
            int rem=x%10;
            sum=sum*10+rem;
            x=x/10;
        }
        if (sum!=s) {
            return false;
        }
        return true;
    }
}
