class Solution {
    public int maxArea(int[] heights) {
        int area=0, maxArea=0;
        int i = 0; int j = heights.length-1;
        while(i<j){
            int dist = j-i;
            area = Math.min(heights[i],heights[j])*dist;
            maxArea = Math.max(area, maxArea);
            if(heights[i] < heights[j]){
                i+=1;
            } else {
                j-=1;
            }
        }
        return maxArea;    
    }
}
