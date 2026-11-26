class Solution(object):
    def canAliceWin(self, n): 
        remove = 10
        turns = 0

        while n >= remove:
            n -= remove
            remove -= 1
            turns += 1

        return (turns & 1) == 1
        """
        :type n: int
        :rtype: bool
        """
        