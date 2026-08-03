class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        int maxCount = 0;
        int l = 0;
        for(int r=0; r<s.length();r++){
            char ch = s.charAt(r);
            if (mp.containsKey(ch)){
                l = Math.max(l,mp.get(ch) + 1);
            }
            mp.put(ch,r);
            maxCount = Math.max(maxCount, r-l+1);
        }
        return maxCount;
    }
}
