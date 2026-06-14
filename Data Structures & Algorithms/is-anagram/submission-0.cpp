class Solution {
public:
    bool isAnagram(string s, string t) {
        unordered_map<char,int> ms; unordered_map<char,int> mt;
        int ns = s.size(); int nt = t.size();
        if (ns != nt) return false;
        for (int i=0; i<ns; i++){
            ms[s[i]] += 1; mt[t[i]]+=1;
        }
        for(const auto& [key, value_s] : ms){
            auto it = mt.find(key);
            if (it == mt.end()) return false; // early return char of s not found in t
            int value_t = it->second;
            if (value_s != value_t) return false; // early return for char count mismatches
        }
        return true;
    }
};
