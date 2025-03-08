package LeetCodeGfg;

public class RemoveAllAdjecentfromString {
    public static void main(String[] args) {
        String s="azxxzy";
        System.out.println(removeDuplicates(s));
    }
    public static  String removeDuplicates(String s) {
        StringBuilder p= new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(p.length ()>0 && p.charAt(p.length() - 1) == ch)
            {
                p.deleteCharAt(p.length() - 1);
            }
            else
            {
                p.append(ch);
            }
        }
        return p.toString();
    }
}
