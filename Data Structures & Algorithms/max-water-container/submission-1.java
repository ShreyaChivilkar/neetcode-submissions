class Solution {
    public int maxArea(int[] heights) {

        int maxVal = 0;
        int left = 0;
        int right = heights.length - 1;

        while(left < right){
            int val = (right - left) * Math.min(heights[left], heights[right]);

            maxVal = Math.max(maxVal, val);

            if(heights[left] < heights[right]){
                left ++;
            }
            else{
                right --;
            }
        }

        return maxVal;
        
    }
}
