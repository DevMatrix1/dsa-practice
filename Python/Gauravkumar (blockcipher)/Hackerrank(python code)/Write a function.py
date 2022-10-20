# Coded By Block_Cipher

# https://www.hackerrank.com/challenges/write-a-function/problem?isFullScreen=false


 
def is_leap(years):
        leap = False
        if (years % 4 == 0):
                if (years % 100 == 0):
                        if (years % 400 == 0):
                                return(True)
                        return(False)
                return(True)
        return(False)
        #return leap

    
    

