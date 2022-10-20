class Solution(object):
    def asteroidCollision(self, asteroids):
        """
        :type asteroids: List[int]
        :rtype: List[int]
        """
        st = []
        flag=False
        for i in asteroids:
            flag=False
            if i > 0:
                st.append(i)
            if i < 0:
                if not st or st[-1] < 0:
                    st.append(i)
                else:
                    while st and st[-1]>0:
                        if abs(st[-1]) > abs(i):
                            break
                            
                        if abs(st[-1]) == abs(i):
                            flag=True 
                            st.pop()
                            break
                        else:
                            st.pop()
                    if not st and flag==False:
                        st.append(i)
                        continue
                    if flag == True:
                        continue
                    if st and st[-1] < 0:
                        st.append(i)
                    
                    
        return st
                    
                
                
        