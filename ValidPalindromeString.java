package LeetCodeGfg;

public class ValidPalindromeString {
    public static void main(String[] args) {
        String s= "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s){
        String sp=s.toLowerCase();
        StringBuilder sb= new StringBuilder();
           // char[] ch= sp.toCharArray();
            for(int i=0;i<sp.length();i++){
            if(Character.isLetter(i)) {
                sb.append(i);
              }
            }
            for(int j=0;j<sb.length()/2;j++){
                if(sb.charAt(j)!=sb.charAt(sb.length()-1-j)){
                    return false;
                }
            }
        return true;
    }
}
