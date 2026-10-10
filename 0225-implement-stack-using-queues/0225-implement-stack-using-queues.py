class MyStack(object):

    def __init__(self):
        self.q = deque()

    def push(self, x):
        self.q.append(x)
        for _ in range(len(self.q) - 1):
            self.q.append(self.q.popleft())
        """
        :type x: int
        :rtype: None
        """
        

    def pop(self):
        return self.q.popleft()
        """
        :rtype: int
        """
        

    def top(self):
        return self.q[0]
        """
        :rtype: int
        """
        

    def empty(self):
        return len(self.q) == 0
        """
        :rtype: bool
        """
        


# Your MyStack object will be instantiated and called as such:
# obj = MyStack()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.top()
# param_4 = obj.empty()