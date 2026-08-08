class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        mp = [0]*26
        l = 0
        r = 0
        maxFreq = 0
        maxLen = 0
        strLen = len(s)
        while (r < strLen):
            mp[ord(s[r])-65]+=1
            maxFreq = max(maxFreq, mp[ord(s[r])-65])
            if (r - l + 1 - maxFreq > k):
                mp[ord(s[l])-65] -= 1
                l+=1
            else:
                maxLen = max(maxLen, r-l+1)
            r+=1
        return maxLen
