class Solution(object):
    def findPoisonedDuration(self, timeSeries, duration):
        if not timeSeries or duration == 0:
            return 0
        return sum(min(duration, b - a) for a, b in zip(timeSeries, timeSeries[1:])) + duration
        """
        :type timeSeries: List[int]
        :type duration: int
        :rtype: int
        """
        