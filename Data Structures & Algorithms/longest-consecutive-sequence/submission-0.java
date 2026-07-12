class Solution {
    public int longestConsecutive(int[] nums) {
        List<Integer> list=Arrays.stream(nums).boxed().collect(Collectors.toList());
        int longestSequence=0;
        for(int num:nums){
            if(longestSequence==nums.length)
                return longestSequence;
            int currentNum=num;
            int maxOccurentForCurrentNumber=1;
            while(list.contains(currentNum+1)){
                maxOccurentForCurrentNumber+=1;
                currentNum+=1;
            }
            longestSequence=longestSequence>maxOccurentForCurrentNumber?longestSequence:maxOccurentForCurrentNumber;
        }
        return longestSequence;
    }
}
