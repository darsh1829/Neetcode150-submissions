class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int maxArea = 0;
        for(int i=0;i<n;i++){
            int height = heights[i];
            int l = i;
            int r = i+1;
            
            while(r<n && heights[r]>= height){
                r++;
            }

            while(l>=0  && heights[l]>=height){
                l--;
            }

            r--;
            l++;
            maxArea = Math.max(maxArea, height * (r-l+1));

        }

        return maxArea;
    }
}
