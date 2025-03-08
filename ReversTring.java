package LeetCodeGfg;

public class ReversTring {
    public static void main(String[] args) {
     String s="abc";
        System.out.println(reverse(s));
    }
    static String reverse(String s){
        String a="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(s.length()-1-i);
            a=a+ch;
        }
        return a;
    }
}
