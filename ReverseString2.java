package LeetCodeGfg;

public class ReverseString2 {
    public static void main(String[] args) {
        String str= "i.like.this";
        System.out.println(reverseWords(str));
    }
    static String reverseWords(String str) {
        String[] word = str.split("\\.");
        StringBuilder result = new StringBuilder();
        for(int i=word.length-1;i>=0;i--){
            result.append(word[i]);

            if(i > 0){
                result.append(".");
            }
        }
        return result.toString();
    }
}
