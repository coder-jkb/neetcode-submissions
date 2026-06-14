#include <bits/stdc++.h>
class Solution {
public:
    void insertOrIncrement(std::map<int,int>& mp, int key) {
        if (mp.find(key) == mp.end()) mp[key] = 1;
        else mp[key] += 1;
    }
    bool hasDuplicate(vector<int>& nums) {
        std::map<int,int> mp;
        int len = nums.size();
        for (int i=0; i<len; i++) {
            insertOrIncrement(mp, nums[i]);
            if (mp[nums[i]] > 1) return true;
        }
        return false;
    }
};