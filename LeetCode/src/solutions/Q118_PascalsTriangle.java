package solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
Return

[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
*/
public class Q118_PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Integer[][] res = new Integer[numRows][];
        for (int i = 0; i < numRows; i++){
        	res[i] = new Integer[i+1];
        	for (int j = 0; j < res[i].length; j++){
        		if (j == 0 || j == res[i].length-1) res[i][j] = 1;
        		else res[i][j] = res[i-1][j-1] + res[i-1][j];
        	}
        	result.add(Arrays.asList(res[i]));
        }        
        return result;
    }
    public static void main(String[] args){
    	Q118_PascalsTriangle test = new Q118_PascalsTriangle();
    	test.generate(6);
//        for (int i = 0; i < res.length; i++){
//        	for (int j = 0; j < res[i].length; j++){
//        		System.out.print(res[i][j] + " ");
//        	}
//        	System.out.println();
//        }
    }
}
