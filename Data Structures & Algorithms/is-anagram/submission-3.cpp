class Solution {
public:
    bool isAnagram(string s, string t) {
        int ns = s.size(); int nt = t.size();
        if (ns != nt) return false;
        vector<int> chars(26,0);
        int sum = 0;
        for (int i=0; i<ns; i++){
            chars[s[i]-'a']+=1; chars[t[i]-'a']-=1;
        }
        for(int i:chars) {
            if (i != 0) return false;
        }
        return true;
    }
};
