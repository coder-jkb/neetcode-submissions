class Solution:
    def isPalindrome(self, s: str) -> bool:
        sc = re.sub(r'[^a-zA-Z0-9]','',s).lower()
        i, j  = 0, len(sc)-1
        while(i<=j):
            if sc[i] != sc[j]:
                return False
            i+=1
            j-=1
        return True

