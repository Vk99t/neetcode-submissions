class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int profit=Integer.MIN_VALUE;
        for(int number:prices){
           if(number<min){
            min=number;
           }
           if(number-min>profit){
            profit=number-min;
           }
        }
        return profit;
    }
}
