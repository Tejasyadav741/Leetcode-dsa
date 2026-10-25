class Solution(object):
    def searchMatrix(self, matrix, target):
        rows, cols = len(matrix), len(matrix[0])
        row, col = 0, cols - 1
        while row < rows and col >= 0:
            current = matrix[row][col]
            if current == target:
                return True
            elif current > target:
                col -= 1
            else:
                row += 1   
        return False
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        