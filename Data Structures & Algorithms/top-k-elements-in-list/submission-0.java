class Solution {
    public int[] topKFrequent(int[] nums, int k) {
              Map<Integer,Long>  frequency=Arrays.stream(nums).boxed().collect(Collectors.groupingBy(java.util.function.Function.identity(),Collectors.counting()));
             return frequency.entrySet().stream().
              sorted((a,b)->Long.compare(b.getValue(),a.getValue())).limit(k).mapToInt(a->a.getKey().intValue()).toArray();

    }
}
