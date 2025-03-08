package LeetCodeGfg;

import java.util.ArrayList;

public class FactorialArraylist {
    public static void main(String[] args) {
        int n=8;
        System.out.println(fact(n));
    }
    static ArrayList<Integer> fact(int n){
        ArrayList<Integer> list= new ArrayList<>();
        int sum=1;
        while(n!=0){
            sum=sum*n;
            n--;
        }
        String s= String.valueOf(sum);
        for(int i=0;i<=s.length()-1;i++){
            char ch=s.charAt(i);
            list.add(Character.getNumericValue(ch));
        }
         return list;
        }
    }
