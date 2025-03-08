package LeetCodeGfg;

public class ReverseString {
    public static void main(String[] args){
        String S="aba";
        System.out.println(isPalindrome(S));
    }
        static int isPalindrome(String S){
            for(int i=0;i<S.length()/2;i++){
                if(S.charAt(i)+i!=S.charAt(S.length()-1-i)){
                    return 0;
                }
            }
            return 1;
        }
}
