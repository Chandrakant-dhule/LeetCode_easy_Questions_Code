package LeetCodeGfg;

public class RotateString {
    public static void main(String[] args) {

       String s = "abcde";
       String goal = "cdeab";
        System.out.println(rotateString(s,goal));
    }
        public static boolean rotateString(String s, String goal) {
            StringBuilder sb = new StringBuilder(s);
            for(int i=0;i<=s.length()-1;i++){
                sb.append(sb.charAt(0));
                sb.deleteCharAt(0);
                if(sb.toString().equals(goal)){
                    return true;
                }
            }
            return false;
        }
    }