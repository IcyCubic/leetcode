package solutions;
/*
Find the total area covered by two rectilinear rectangles in a 2D plane.

Each rectangle is defined by its bottom left corner and top right corner 
as shown in the figure.
Rectangle Area

Assume that the total area is never beyond the maximum possible value of 
int.

Credits:
Special thanks to @mithmatt for adding this problem, creating the above 
image and all test cases.
*/
public class Q223_RectangleArea {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int area1 = (C-A)*(D-B);
        int area2 = (G-E)*(H-F);
    	int overlap;
        if (E >= C || F >= D || H <= B || A > G)
    		overlap = 0;
        else {
        	int point1 = Math.max(A, E); //a
        	int point2 = Math.max(B, F); //b
        	int point3 = Math.min(C, G); //c
        	int point4 = Math.min(D, H); //d
        	int length = point3 - point1;
        	int width = point4 - point2;
        	overlap = length * width;
        }                
        return area1 + area2 - overlap;
    }

    public static void main(String[] args){
    	Q223_RectangleArea test = new Q223_RectangleArea();
    	int area = test.computeArea(-2,-2,2,2,3,3,4,4);
    	System.out.println(area);
    }
}
