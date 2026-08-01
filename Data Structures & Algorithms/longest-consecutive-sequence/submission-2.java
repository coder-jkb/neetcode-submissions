class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums){
            set.add(num);
        }
        int maxCount = 0;
        for (int s : set)
        {
            if(!set.contains(s-1)){
                int count = 0;
                int i = s;
                while(set.contains(i)){
                    count += 1;
                    i+=1;
                }
                maxCount = Math.max(count, maxCount);
            }
        }
        return maxCount;
    }
}