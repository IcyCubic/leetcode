package solutions;
/*
 You are a product manager and currently leading a team to develop a new 
 product. Unfortunately, the latest version of your product fails the 
 quality check. Since each version is developed based on the previous 
 version, all the versions after a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the 
first bad one, which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which will return whether
version is bad. Implement a function to find the first bad version. You 
should minimize the number of calls to the API.

Credits:
Special thanks to @jianchao.li.fighter for adding this problem and 
creating all test cases.
*/
public class Q278_FirstBadVersion {
    public int firstBadVersion(int n) {    	
    	if (n==1) return n;
        long L = 0; //init values
        long R = n;
        int  m = (int)((L + R) / 2);
        
        while (!(isBadVersion(m) == true && isBadVersion(m-1) == false)){ //exit condition
        	if (isBadVersion(m)) 
        		R = m - 1;
        	else
        		L = m + 1;
        	m = (int)((L + R) / 2);      
        }        	                   
        return (int)m;
    }
    
    private boolean isBadVersion(int n){
    	int target = 1702766719;
    	if (n >= target) return true;
    	return false;
    }
    public static void main(String[] args){
    	Q278_FirstBadVersion test = new Q278_FirstBadVersion();
    	System.out.println(test.firstBadVersion(2126753390));    
    	}
}

//2126753390 versions
//1702766719 is the first bad version.
