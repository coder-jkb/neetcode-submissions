class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int len=nums.size();
        unordered_map<int, int> mp;
        for(int i=0; i<len; i++) {
            auto it = mp.find(target - nums[i]);
            if (it == mp.end()){ // not found
                mp[nums[i]] = i;
            } else { // found
                return {it->second, i};
            }
        }
    }
};
