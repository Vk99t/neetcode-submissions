class Solution {
    public int search(int[] nums, int target) {
        List<Integer> list=Arrays.stream(nums).boxed().collect(Collectors.toList());
        // if(list.contains(target)){
            return list.indexOf(target);
        // }
    }
}
