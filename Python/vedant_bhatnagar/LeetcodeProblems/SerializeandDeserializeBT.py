# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Codec:

    def serialize(self, root):
        """Encodes a tree to a single string.
        
        :type root: TreeNode
        :rtype: str
        """
        if root:
            return str(root.val) + "(" + self.serialize(root.left) + ")(" + self.serialize(root.right) + ")"
        return "X"

    def deserialize(self, data):
        """Decodes your encoded data to tree.
        
        :type data: str
        :rtype: TreeNode
        """
        if data == "X":
            return None
        data = data.split("(", 1)
        root=TreeNode(int(data[0]))
        data = data[1]
        c = 1
        for i in range(len(data)):
            if data[i] == "(":
                c+=1
            elif data[i] == ")":
                c-=1
                if c==0:
                    root.left = self.deserialize(data[:i])
                    root.right = self.deserialize(data[i+2: -1])
                    return root
                

# Your Codec object will be instantiated and called as such:
# ser = Codec()
# deser = Codec()
# ans = deser.deserialize(ser.serialize(root))