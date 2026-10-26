class Solution(object):
    def validPalindrome(self, s):
        def check_palindrome(l, r):
            while l < r:
                if s[l] != s[r]:
                    return False
                l += 1
                r -= 1
            return True
        left, right = 0, len(s) - 1
        while left < right:
            if s[left] != s[right]:
                return check_palindrome(left + 1, right) or check_palindrome(left, right - 1)
            left += 1
            right -= 1
        return True