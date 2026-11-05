class Solution(object):
    def findTheDistanceValue(self, arr1, arr2, d):
        arr2.sort()
        count = 0
        for num in arr1:
            idx = bisect.bisect_left(arr2, num)
            valid = True
            if idx < len(arr2) and abs(arr2[idx] - num) <= d:
                valid = False
            elif idx > 0 and abs(arr2[idx - 1] - num) <= d:
                valid = False
            if valid:
                count += 1
        return count
        """
        :type arr1: List[int]
        :type arr2: List[int]
        :type d: int
        :rtype: int
        """
        