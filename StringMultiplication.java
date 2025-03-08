package LeetCodeGfg;

import java.math.BigInteger;

public class StringMultiplication {
    public static void main(String[] args) {
        String s1 = "12";
        String s2 = "10";
        System.out.println(multiplyStrings(s1, s2));
    }

    public static String  multiplyStrings(String s1, String s2) {
//        BigInteger a=new BigInteger(s1);
//        BigInteger b= new BigInteger(s2);
//        BigInteger i = a.add(b);
//        return i.toString();
        int a=Integer.parseInt(s1);
        int b=Integer.parseInt(s2);
        int c=a+b;
        return String.valueOf(c);
    }
}