"""
# Definition for a Node.
class Node(object):
    def __init__(self, val=None, children=None):
        self.val = val
        self.children = children
"""

class Solution(object):
    def preorder(self, root):
        if not root:
            return []

        res = []
        stack = [root]

        while stack:
            node = stack.pop()
            res.append(node.val)
            if node.children:
                stack.extend(reversed(node.children))

        return res
        
        """
        :type root: Node
        :rtype: List[int]
        """
        