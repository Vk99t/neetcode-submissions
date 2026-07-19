class Solution {
    public boolean isAnagram(String s, String t) {
      if(s.length()!=t.length()){
        return false;
      }

       Map<Character,Integer> map1=new HashMap<>();
       boolean isAnagram=true;
       for(char c:s.toCharArray()){
        map1.put(c,map1.getOrDefault(c,0)+1);
       }

       for(char c:t.toCharArray()){
        int frequency=map1.getOrDefault(c,0);
        if(frequency==0){ // if character is not present
            return false;
        }
        if((frequency-1)>0){
            isAnagram=false;
        }
        if((frequency-1)==0){
            isAnagram=true;
        }
        map1.put(c,frequency-1);
       }
       return isAnagram;
    }
}
