Link - https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/description/

# Solution

class Solution(object):
    def removeDuplicates(self, s):
        """
        :type s: str
        :rtype: str
        """
        st = []
        for i in s :
            if not st:
                st.append(i)
            else:
                if st[-1] == i:
                    st.pop()
                else:
                    st.append(i)
        return ("").join(st)
