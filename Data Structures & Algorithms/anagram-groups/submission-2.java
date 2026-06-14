class Solution {
    public String getHash(String str) {
        StringBuilder hash = new StringBuilder();
        int[] freq = new int[26];
        for(char ch : str.toCharArray()){
            freq[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            hash.append(freq[i]);
            hash.append('_');
        }
        return hash.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0; i<strs.length; i++){
            String key = getHash(strs[i]);
            if(!map.containsKey(key)){
                map.put(key,res.size());
                res.add(new ArrayList<>());
            }
            res.get(map.get(key)).add(strs[i]);
        }
        return res;
    }
}
