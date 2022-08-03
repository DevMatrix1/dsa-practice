#implementing LRU cache problem using Doubly linked list

class DLL():
    def __init__(self, val=0, key=0):
        self.val = val
        self.key = key
        self.left = self.right = None

def delete(node):
    node.right.left, node.left.right = node.left, node.right

def insertxleftofy(x,y):
    x.left, x.right = y.left, y
    y.left.right, y.left = x, x
    
class LRUCache(object):

    def __init__(self, capacity):
        """
        :type capacity: int
        """
        self.capacity = capacity
        self.m = dict()
        self.leftend, self.rightend = DLL(),DLL()
        self.leftend.right, self.rightend.left = self.rightend, self.leftend
        

    def get(self, key):
        """
        :type key: int
        :rtype: int
        """
        if key not in self.m:
            return -1
        node = self.m[key]
        delete(node)
        insertxleftofy(node, self.rightend)
        return node.val
        

    def put(self, key, value):
        """
        :type key: int
        :type value: int
        :rtype: None
        """
        if key in self.m:
            node = self.m[key]
            node.val = value
            delete(node)
        else:
            node = DLL(value,key)
            self.m[key] = node
        insertxleftofy(node, self.rightend)
        if len(self.m) >self.capacity:
            k = self.leftend.right.key
            delete(self.leftend.right)
            del self.m[k]
        


# Your LRUCache object will be instantiated and called as such:
# obj = LRUCache(capacity)
# param_1 = obj.get(key)
# obj.put(key,value)