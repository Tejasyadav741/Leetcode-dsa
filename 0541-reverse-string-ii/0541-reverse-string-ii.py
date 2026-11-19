class Solution(object):
    def reverseStr(self, s, k):
        chars = list(s)
        for i in range(0, len(chars), 2 * k):
            chars[i:i + k] = chars[i:i + k][::-1]
            
        return "".join(chars)
        """
        :type s: str
        :type k: int
        :rtype: str
        """
        