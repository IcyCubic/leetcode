package solutions;

public class Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        for (int first = 0, max=nums.length; first < max; first++){
            for (int second = first + 1; second < max; second++){
                if (nums[first] + nums[second] == target){	                    
                	return new int[] {first, second};
                }
            }
        }
    return null;
    }
    
    public static void main(String[] args){
    	Two_Sum ts = new Two_Sum();
    	int[] solution = ts.twoSum(new int[]{3,2,4}, 6);
    	System.out.printf("[%d,%d]", solution[0], solution[1]);   	
    }
}
