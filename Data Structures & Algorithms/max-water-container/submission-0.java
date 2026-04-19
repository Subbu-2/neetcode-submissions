class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int j= heights.length -1;
        int maxSum = 0;
        while(i<j){
        int sum = Math.min(heights[i],heights[j])*(j-i);
        maxSum = Math.max(maxSum, sum);
        if(heights[i]<= heights[j]){
            i++;
        }
        else{
            j--;
        }
        }
        return maxSum;
    }
}
