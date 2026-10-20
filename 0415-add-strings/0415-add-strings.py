class Solution(object):
    def addStrings(self, num1, num2):
        res = []
        p1, p2 = len(num1) - 1, len(num2) - 1
        carry = 0
        while p1 >= 0 or p2 >= 0 or carry:
            d1 = ord(num1[p1]) - ord('0') if p1 >= 0 else 0
            d2 = ord(num2[p2]) - ord('0') if p2 >= 0 else 0
            total = d1 + d2 + carry
            carry = total // 10
            res.append(str(total % 10))
            p1 -= 1
            p2 -= 1
        return "".join(res[::-1])
        """
        :type num1: str
        :type num2: str
        :rtype: str
        """
        