class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> num=Arrays.stream(nums).boxed().collect(Collectors.toSet());
        for(int i=0;i<=num.size();i++){
            if(!num.contains(i)){
                return i;
            }
        }
        return 0;
    }
}
