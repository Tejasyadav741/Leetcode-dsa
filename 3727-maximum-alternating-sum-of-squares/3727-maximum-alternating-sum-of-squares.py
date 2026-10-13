class Solution(object):
    def maxAlternatingSum(self, nums):
        for i in range(len(nums)):
            nums[i] *= nums[i]
        nums.sort()
        cutoff = len(nums) // 2
        return sum(nums[cutoff:]) - sum(nums[:cutoff])
        """
        :type nums: List[int]
        :rtype: int
        """
        