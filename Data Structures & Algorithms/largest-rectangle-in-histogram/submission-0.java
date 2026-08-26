class Solution {
    public int largestRectangleArea(int[] heights) {
        int n= heights.length;
        
        int maxArea = 0;

        for(int i=0;i<n;i++){
            int leftMost = i;
        int rightMost = i+1;
            int height = heights[i];
            while(rightMost < n && heights[rightMost] >= height){
                rightMost++;
            }

            while( leftMost>= 0 && heights[leftMost] >= height ){
                leftMost--;
            }
            rightMost--;
            leftMost++;
            maxArea = Math.max(maxArea, height * ( rightMost - leftMost +1));
        }
        return maxArea;
    }
}
