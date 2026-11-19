class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> tracker=new HashSet<>();
        for(int num:nums){
           if(!tracker.add(num)) return true;
        }
        return false;
    }
}