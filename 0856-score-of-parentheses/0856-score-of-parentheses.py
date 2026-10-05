class Solution(object):
    def scoreOfParentheses(self, s):
        stack = [0]
        for char in s:
            if char == '(':
                stack.append(0)
            else:
                inner_score = stack.pop()
                stack[-1] += max(2 * inner_score, 1)
        return stack[0]
        """
        :type s: str
        :rtype: int
        """
        