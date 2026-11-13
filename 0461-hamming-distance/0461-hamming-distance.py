class Solution(object):
    def hammingDistance(self, x, y):
        xor = x ^ y
        distance = 0
        while xor > 0:
            xor &= (xor - 1)
            distance += 1
            
        return distance
        """
        :type x: int
        :type y: int
        :rtype: int
        """
        