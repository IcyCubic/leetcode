package solutions;

import java.util.ArrayList;
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
        List<Integer> list;
        for (int i = 0; i < numRows; i++){
        	list = new ArrayList<Integer>(i+1);
        	for (int j = 0; j <= i; j++){
        		if (j == 0 || j == i) list.add(1);
        		else list.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));        		
        	}
        	result.add(list);
        }        
        return result;
    }
    public static void main(String[] args){
    	Q118_PascalsTriangle test = new Q118_PascalsTriangle();
    	test.generate(6);
    }
}
