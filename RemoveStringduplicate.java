package LeetCodeGfg;

public class RemoveStringduplicate {
    public static void main(String[] args) {
        String s="gfg";
        System.out.println(duplicate(s));
    }
    static String duplicate(String s){
        String c="";
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)!=s.charAt(i+1)){
                c=c+s.charAt(i);
            }
        }
      //  c=c+s.charAt(s.length()-1);
        return c;
    }
}
