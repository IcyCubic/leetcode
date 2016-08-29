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
    
	//returns a filled in version of the shorter string array
	private String[] fill(String[] longer, String[] shorter){
    	String[] temp = new String[longer.length];
    	for (int i = 0; i < temp.length; i++){
    		if (i < shorter.length)
    			temp[i] = shorter[i];
    		else
    			temp[i] = "0";        		
    	}
    	return temp;
	}
	
	public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("[.]");        
        String[] v2 = version2.split("[.]");
        
        if (v1.length > v2.length)
        	v2 = fill(v1, v2);
        else if (v1.length < v2.length)
        	v1 = fill(v2, v1);
        
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
    	System.out.println(test.compareVersion("1.0", "0.1.2"));
    }
}

/* - 0-1ms solution for reference. One pass
public static int compareVersion(String version1, String version2) {
    int l1 = version1.length();
    int l2 = version2.length();
    int v1 = 0;
    int v2 = 0;
    
    int i1 = 0;
    int i2 = 0;
    
    while (i1 < l1 || i2 < l2){
    	   	
    	while (i1 < l1 && version1.charAt(i1)!='.'){
        	v1 = 10*v1 + (version1.charAt(i1) - '0') ;
        	i1++;
    	}
    	
    	while (i2 < l2 && version2.charAt(i2)!='.'){
        	v2 = 10*v2 + (version2.charAt(i2) - '0') ;
        	i2++;
    	}
        	
        if (v1 > v2) return 1;
        else if (v1 < v2) return -1 ;
        else {
            v1 = 0;
            v2 = 0;
            i1++;
            i2++;
        }
    }

    return 0;
}
*/
