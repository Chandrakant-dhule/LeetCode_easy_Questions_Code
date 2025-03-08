package LeetCodeGfg;

public class RemoveDuplicateFromString {
    public static void main(String[] args) {
        String str="geeksforgeeks";
        System.out.println(removeDuplicates(str));
    }
    static String removeDuplicates(String str) {
        StringBuilder s=new StringBuilder();
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)!=str.charAt(i+1)){
                s.append(str.charAt(i));
            }
        }
        return s.toString();
    }
}
