package LeetCodeGfg;

public class BinaryCheck {
    public static void main(String[] args) {
        String str="901";
        System.out.println(isBinary(str));
    }
    static boolean isBinary(String str)
    {
        for(int i=0;i<str.length();i++){
            if(str.charAt(0) =='1' && str.charAt(i)=='0'){
                return true;
            }
        }
        return false;
    }
}
