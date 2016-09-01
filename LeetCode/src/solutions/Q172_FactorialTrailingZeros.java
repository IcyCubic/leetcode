package solutions;

public class Q172_FactorialTrailingZeros {
    public int trailingZeroes(int n) {
        int count = 0;    
        while(n > 0) {
            n /= 5;
            count += n;
        }    
        return count;
    }
    public static void main(String[] args){
    	Q172_FactorialTrailingZeros test = new Q172_FactorialTrailingZeros();
    	System.out.println(test.trailingZeroes(23));
    }
}
