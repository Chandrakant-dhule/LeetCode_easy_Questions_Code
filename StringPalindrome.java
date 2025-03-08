package LeetCodeGfg;

public class StringPalindrome {
    public static void main(String[] args) {
        String  s="abda";
        System.out.println(palin(s));
    }
    static int palin(String s){
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return 0;
            }
        }
        return 1;
    }
}
