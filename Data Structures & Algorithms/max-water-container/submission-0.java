class Solution {
    public int maxArea(int[] heights) {
        int sum=0;
        int height;
        int width;
       int l=0,r=heights.length-1;
       while(l<r){
         width=(r-l);
         height=Math.min(heights[l],heights[r]);
         sum=Math.max(sum,width*height);
         if(heights[l]<heights[r]){
            l++;
         }
         else {
            r--;
         }

       }

        return sum;
    }
}
