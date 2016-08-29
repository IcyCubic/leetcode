package solutions;
/*
Compare two version numbers version1 and version2.
If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.

You may assume that the version strings are non-empty and contain only digits and the . character.
The . character does not represent a decimal point and is used to separate number sequences.
For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.

Here is an example of version numbers ordering:

0.1 < 1.1 < 1.2 < 13.37
*/
public class Q165_CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("[.]");        
        String[] v2 = version2.split("[.]");
        
        if (v1.length > v2.length){
        	
        }
        
        for (int i = 0; i < v1.length; i++){
        	int val1 = Integer.parseInt(v1[i]);
        	int val2 = Integer.parseInt(v2[i]);        	
        	if (val1 > val2) 
        		return 1;
        	else if (val1 < val2)
        		return -1;
        }
    	return 0;
    }
    
    public static void main(String[] args){
    	Q165_CompareVersionNumbers test = new Q165_CompareVersionNumbers();
    	System.out.println(test.compareVersion("1", "0"));
    }
}
