class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int maxarea=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int w=j-i;
                int h=Math.min(height[i],height[j]);
                maxarea=Math.max(maxarea,h*w);
            }
        }return maxarea;

    }
}