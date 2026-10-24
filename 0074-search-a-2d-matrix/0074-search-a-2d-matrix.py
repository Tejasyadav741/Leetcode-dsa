class Solution(object):
    def searchMatrix(self, matrix, target):
        rows, cols = len(matrix), len(matrix[0])
        left, right = 0, (rows * cols) - 1
        while left <= right:
            mid = (left + right) // 2
            mid_val = matrix[mid // cols][mid % cols]
            if mid_val == target:
                return True
            elif mid_val < target:
                left = mid + 1
            else:
                right = mid - 1
        return False
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        