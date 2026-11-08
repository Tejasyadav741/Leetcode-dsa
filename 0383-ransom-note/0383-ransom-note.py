class Solution(object):
    def canConstruct(self, ransomNote, magazine):
        if len(ransomNote) > len(magazine):
            return False
        return not collections.Counter(ransomNote) - collections.Counter(magazine)
        """
        :type ransomNote: str
        :type magazine: str
        :rtype: bool
        """
        