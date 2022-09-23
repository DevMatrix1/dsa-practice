# Coded By Block_Cipher

# https://www.hackerrank.com/challenges/capitalize/problem?isFullScreen=false


def solve(s):
        for i in s[:].split():
                s = s.replace(i,i.capitalize())
        return s
        
        



    
