# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def findMode(self, root):
        state = [None, 0, 0]
        modes = []

        def inorder(node):
            if not node:
                return

            inorder(node.left)

            if node.val == state[0]:
                state[1] += 1
            else:
                state[0] = node.val
                state[1] = 1

            if state[1] > state[2]:
                state[2] = state[1]
                del modes[:]
                modes.append(node.val)
            elif state[1] == state[2]:
                modes.append(node.val)

            inorder(node.right)

        inorder(root)
        return modes
        """
        :type root: Optional[TreeNode]
        :rtype: List[int]
        """
        