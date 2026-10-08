class Solution(object):
    def removeOuterParentheses(self, s):
        result = []
        depth = 0
        for char in s:
            if char == '(':
                if depth > 0:
                    result.append(char)
                depth += 1
            else:
                depth -= 1
                if depth > 0:
                    result.append(char)
        return "".join(result)
        """
        :type s: str
        :rtype: str
        """
        