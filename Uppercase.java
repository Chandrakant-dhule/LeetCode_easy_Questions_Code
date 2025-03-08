package LeetCodeGfg;

public class Uppercase {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(upper(str));
    }
        static String upper(String str)
        {    String s="";
             for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                  s=s+ch;
            }
            return s.toUpperCase();
        }
    }
