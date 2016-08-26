package solutions;
/*
Implement pow(x, n). 
*/
public class Q050_Pow {
    public double myPow(double x, int n) {
    	double result = 1.0;
    	boolean negative = false;
    	if (n < 0) {
    		n = -n;
    		negative = true;
    	}
    	for (int i = 0; i < n; i++){
    		result *= x;
    	}    	
    	return negative? 1/result : result;
    }
    
    public static void main(String[] args){
    	Q050_Pow test = new Q050_Pow();
    	System.out.println(test.myPow(34.00515, -3));
    	System.out.println(Math.pow(34.00515, -3));
    }
}
