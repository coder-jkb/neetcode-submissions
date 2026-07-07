class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        numSet = set(nums)
        count = 0
        longest = 0
        for n in numSet:
            if (n-1) not in numSet:
                start = n
                while (n in numSet):
                    count += 1
                    n+=1
                longest = max(count, longest)
                count = 0
        return longest
# 2,20,4,10,3,4,5
# c = 4
# long = 0
# s = 2