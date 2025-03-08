package LeetCodeGfg;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        int num=9;
        System.out.println(isPerfectSquare(num));
    }
        public static boolean isPerfectSquare(int num){
            long s=1;
            long e=num;
            while(s<=e){
                long mid=s+(e-s)/2;
                long square= mid*mid;
                if(square==num){
                    return true;
                }
                else if(square<num){
                    s=mid+1;
                }
                else {
                    e=mid-1;
                }
            }
            return false;
        }
    }
