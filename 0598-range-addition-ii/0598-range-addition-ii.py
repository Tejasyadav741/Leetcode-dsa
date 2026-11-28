class Solution(object):
    def maxCount(self, m, n, ops):
        min_row = m
        min_col = n

        for a, b in ops:
            if a < min_row:
                min_row = a
            if b < min_col:
                min_col = b

        return min_row * min_col
        
        """
        :type m: int
        :type n: int
        :type ops: List[List[int]]
        :rtype: int
        """
        