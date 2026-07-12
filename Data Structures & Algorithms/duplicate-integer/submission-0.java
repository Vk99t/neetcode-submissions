class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        List<Integer> list=Arrays.stream(nums).boxed().collect(Collectors.toList());
        Set<Integer> set=new HashSet<>(list);
        return !(set.size()==list.size());
    }
}