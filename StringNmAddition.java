package LeetCodeGfg;

public class StringNmAddition {
    public static void main(String[] args) {
     int num=6;
        System.out.println(checkPerfectNumber(num));
    }
        public static  boolean checkPerfectNumber(int num) {
            int s=num;
            int i=1;
            int sum=0;
            while(i<num){
                if(num%i==0){
                    sum=sum+i;
                }
                i++;
            }
            if(s==sum){
                return true;
            }
            return false;
        }
    }
