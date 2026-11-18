# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def getMinimumDifference(self, root):
        state = [None, float('inf')]

        def inorder(node):
            if not node:
                return

            inorder(node.left)

            if state[0] is not None:
                diff = node.val - state[0]
                if diff < state[1]:
                    state[1] = diff
            state[0] = node.val

            inorder(node.right)

        inorder(root)
        return state[1]
        """
        :type root: Optional[TreeNode]
        :rtype: int
        """
        