class Solution(object):
    def findMaxAverage(self, nums, k):
        curr_sum = 0
        for i in range(k):
            curr_sum += nums[i]
        max_sum = curr_sum
        for i in range(k, len(nums)):
            curr_sum = curr_sum - nums[i - k] + nums[i]
            if curr_sum > max_sum:
                max_sum = curr_sum
        return float(max_sum) / float(k)
        """
        :type nums: List[int]
        :type k: int
        :rtype: float
        """
        