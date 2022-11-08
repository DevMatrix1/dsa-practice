# Link - https://leetcode.com/problems/make-the-string-great/submissions/839474057/

# Solution

class Solution(object):
    def makeGood(self, s):
        """
        :type s: str
        :rtype: str
        """
        st = []
        for i in s:
            if st:
                if i.islower() and st[-1] == i.upper():
                    st.pop()
                elif i.isupper() and st[-1] == i.lower():
                    st.pop()
                else:
                    st.append(i)
            else:
                st.append(i)
        return ("").join(st)
