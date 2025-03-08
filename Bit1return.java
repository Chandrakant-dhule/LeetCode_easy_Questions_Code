package LeetCodeGfg;

public class Bit1return {
    public static void main(String[] args) {
        int n=128;
        System.out.println(bit(n));
    }
    int count = 0;
   public static  int bit(int n){
       int count = 0;

       // While n is not 0, continue checking bits
       while (n != 0) {
           // Increment count if the least significant bit is 1
           count = count+ (n & 1);

           // Right shift n to check the next bit
           n >>= 1;
       }

       return count;
   }
}
