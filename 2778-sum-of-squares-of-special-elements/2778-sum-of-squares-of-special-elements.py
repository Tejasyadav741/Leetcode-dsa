class Solution(object):
    def sumOfSquares(self, nums):
        n = len(nums)
        return sum(val * val for i, val in enumerate(nums, 1) if n % i == 0)
        """
        :type nums: List[int]
        :rtype: int
        """
        