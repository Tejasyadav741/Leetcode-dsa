# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def diameterOfBinaryTree(self, root):
        max_diameter = [0]
        def dfs(node):
            if not node:
                return 0
            left_h = dfs(node.left)
            right_h = dfs(node.right)
            if left_h + right_h > max_diameter[0]:
                max_diameter[0] = left_h + right_h
            return 1 + (left_h if left_h > right_h else right_h)

        dfs(root)
        return max_diameter[0]
        """
        :type root: Optional[TreeNode]
        :rtype: int
        """
        