class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        numSet = set(nums)
        longest = 0
        for n in numSet:
            if (n-1) not in numSet:
                count = 0
                start = n
                while (n in numSet):
                    count += 1
                    n+=1
                longest = max(count, longest)
        return longest