#include <bits/stdc++.h>
class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        std::map<int,int> mp;
        int len = nums.size();
        for (int i=0; i<len; i++) {
            if (mp.find(nums[i]) == mp.end()) mp[nums[i]] = 1;
            else mp[nums[i]] += 1;

            if (mp[nums[i]] > 1) return true;
        }
        return false;
    }
};