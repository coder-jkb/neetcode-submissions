class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        PriorityQueue<Pair<Integer,Integer>> pq = new PriorityQueue<>((a,b) -> b.getValue()-a.getValue());
        for (int i=0;i<nums.length; i++)
        {
            int key = nums[i];
            mp.put(key, mp.getOrDefault(key, 0)+1);
        }

        List<Integer>[] bucket = new List[nums.length+1];
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            int freq = entry.getValue();
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(entry.getKey());
        }
        int count = 0;
        int[] ans = new int[k];
        for(int i = bucket.length - 1; i>0 & count < k; i--){
            if(bucket[i] != null){
                for(int b : bucket[i]){
                    ans[count]=b;
                    count++;
                    if(count==k){
                        return ans;
                    }
                }
            }
        }
        return ans;
    }
}
