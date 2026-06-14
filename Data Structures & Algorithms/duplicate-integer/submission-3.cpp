class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        unordered_map<int,int> mp;
        int len = nums.size();
        for (int i=0; i<len; i++) {
            mp[nums[i]] += 1;
            if (mp[nums[i]] > 1) return true;
        }
        return false;
    }
};