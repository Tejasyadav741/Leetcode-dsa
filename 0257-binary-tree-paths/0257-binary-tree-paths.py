# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def binaryTreePaths(self, root):
        res = []
        def dfs(node, current_path):
            if not node:
                return
            if not node.left and not node.right:
                res.append(current_path + str(node.val))
                return
            dfs(node.left, current_path + str(node.val) + "->")
            dfs(node.right, current_path + str(node.val) + "->")
        dfs(root, "")
        return res
        """
        :type root: Optional[TreeNode]
        :rtype: List[str]
        """
        