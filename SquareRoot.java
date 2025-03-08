package LeetCodeGfg;

public class SquareRoot {
    public static void main(String[] args) {
        int x=24;
        System.out.println(mySqrt(x));
    }
    public static int mySqrt(int x) {
        if (x < 2){
            return x;
        }
        int s = 1;
        int e = x / 2;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (mid*mid<=x)
            {
                s = mid + 1;
            }
            else
            {
                e = mid - 1;
            }
        }
        return e;
    }
}
