class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> result=new HashMap<>();
        for(String str:strs){
           String sortedStr=sortString(str);
           if(result.get(sortedStr)!=null){
              result.get(sortedStr).add(str);
           }
           else{
            List<String> anagramList=new ArrayList<>();
            anagramList.add(str);
            result.put(sortedStr,anagramList);
           }
        }
        List<List<String>> resultList=new ArrayList<>();
        for(Map.Entry<String,List<String>> map:result.entrySet()){
            resultList.add(map.getValue());
        }
        return resultList;
    }

    public static String sortString(String str){
        char[] charArray=str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}
