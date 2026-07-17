class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        List<int[]> result=new ArrayList<>();
        for(int[] arr:intervals){
            if(arr[1]<newInterval[0]) // if current interval before newinterval
            {
                result.add(arr);
            }
            else if(arr[0]>newInterval[1]){ //if current interval is after newInterval
              result.add(newInterval);
              newInterval=arr;
            }
            else{ // merge two intervals into new one
                newInterval[0]=Math.min(newInterval[0],arr[0]);
                newInterval[1]=Math.max(newInterval[1],arr[1]);
            }
        }
        result.add(newInterval);
        return result.toArray(new int[result.size()][]);

    }

}
