class Solution(object):
    def licenseKeyFormatting(self, s, k):
        clean = s.replace("-", "").upper()[::-1]
        return "-".join(clean[i:i + k] for i in range(0, len(clean), k))[::-1]
        """
        :type s: str
        :type k: int
        :rtype: str
        """
        