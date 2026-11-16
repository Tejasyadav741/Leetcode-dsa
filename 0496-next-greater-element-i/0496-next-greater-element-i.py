class Solution(object):
    def nextGreaterElement(self, nums1, nums2):
        next_greater = {}
        stack = [] 
        for num in nums2:
            while stack and num > stack[-1]:
                smaller = stack.pop()
                next_greater[smaller] = num
            stack.append(num)
        return [next_greater.get(x, -1) for x in nums1]
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        