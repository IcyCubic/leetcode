package solutions;
/*
You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
n = 0, ans = 0
n = 1, ans = 1  1
n = 2, ans = 2  11 2
n = 3, ans = 3  111 12 21
n = 4, ans = 5  1111 22 121 211 112
n = 5, ans = 8  11111 2111 1211 1121 1112 221 212 122
n = 6, ans = 13 111111 21111 12111 11211 11121 11112 2211 2121 2112 1221 1212 1122 222
...

hello fibbonacci 
*/
public class Q070_ClimbingStairs {
    public static int climbStairs(int n) {
    	if (n == 0) return 0;
    	int temp;
    	int previous = 0;
    	int current = 1;
    	for (int i = 1; i <= n; i++){		//1 2 3
    		temp = current + previous; 	//1 2 4
    		previous = current;				//1 2 4
    		current = temp;
    	}
        return current;
    }
    
    public static void main(String[] args){
    	System.out.println(climbStairs(4));
    }
}
