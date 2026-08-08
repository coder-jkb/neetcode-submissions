class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        l1 = len(s1)
        l2 = len(s2)
        if (l1 > l2):
            return False
        
        hashList1 = [0]*26
        hashList2 = [0]*26
        for i  in range(l1):
            hashList1[ord(s1[i])-ord('a')] += 1
            hashList2[ord(s2[i])-ord('a')] += 1
        
        matches = 0
        for i in range(26):
            if hashList1[i] == hashList2[i]:
                matches += 1
        

        l, r = 0, l1
        while (r < l2):
            if (matches == 26):
                return True

            i = ord(s2[r])-ord('a')
            hashList2[i] += 1
            if(hashList2[i] == hashList1[i]):
                matches += 1
            elif(hashList2[i] == hashList1[i]+1):
                matches -= 1
            r += 1
            
            i = ord(s2[l])-ord('a')
            hashList2[i] -= 1
            if(hashList2[i] == hashList1[i]):
                matches += 1
            elif(hashList2[i] == hashList1[i]-1):
                matches -= 1

            l+=1

        return matches == 26