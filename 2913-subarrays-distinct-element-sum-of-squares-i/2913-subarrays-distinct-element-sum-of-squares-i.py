class Solution(object):
    def sumCounts(self, nums):
        total_sum = 0
        n = len(nums)
        for i in range(n):
            seen = [False] * 101
            distinct = 0
            for j in range(i, n):
                val = nums[j]
                if not seen[val]:
                    seen[val] = True
                    distinct += 1
                total_sum += distinct * distinct
        return total_sum
        """
        :type nums: List[int]
        :rtype: int
        """
        