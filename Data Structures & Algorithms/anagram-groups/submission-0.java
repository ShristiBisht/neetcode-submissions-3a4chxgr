class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> res = new HashMap<>();
        for ( String str : strs){
            int[] charMap = new int[26];
            for(char c: str.toCharArray()){
                charMap[c-'a']++;
            }
            String key= Arrays.toString(charMap);
            res.putIfAbsent(key,new ArrayList<>());
            res.get(key).add(str);
        }
        return new ArrayList<>(res.values());
    }
}
