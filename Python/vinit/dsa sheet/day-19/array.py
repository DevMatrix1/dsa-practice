#Q:https://practice.geeksforgeeks.org/problems/reversal-algorithm5340/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=reversal-algorithm

 '''def leftRotate(self, arr, n, d):
        # code here
        d=d%n
        arr[:]=arr[d:]+arr[:d]
        return arr
'''