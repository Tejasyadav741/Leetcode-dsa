class Solution(object):
    def longestPalindrome(self, s):
        start = 0
        max_len = 0
        def expand_around_center(left, right):
            while left >= 0 and right < len(s) and s[left] == s[right]:
                left -= 1
                right += 1
            return right - left - 1
        for i in range(len(s)):
            len_odd = expand_around_center(i, i)
            len_even = expand_around_center(i, i + 1)
            curr_max = max(len_odd, len_even)
            if curr_max > max_len:
                max_len = curr_max
                start = i - (curr_max - 1) // 2
        return s[start : start + max_len]
        """
        :type s: str
        :rtype: str
        """
        