class Solution(object):
    def minInsertions(self, s):
        insertions = 0
        right_needed = 0
        for char in s:
            if char == '(':
                if right_needed % 2 != 0:
                    insertions += 1
                    right_needed -= 1
                right_needed += 2
            else:
                right_needed -= 1
                if right_needed < 0:
                    insertions += 1
                    right_needed += 2
        return insertions + right_needed
        """
        :type s: str
        :rtype: int
        """
        