# Coded By Block_Cipher

# https://www.hackerrank.com/challenges/swap-case/problem?isFullScreen=falsae

def swap_case(s):
    x = ""
    for i in s:
        if i.isupper() == True:
                x+=(i.lower())
        else:
                x+=(i.upper())
    return x    
                
                
                
