# Coded By Block_Cipher

# https://www.hackerrank.com/challenges/find-a-string/problem
def count_substring(string, sub_string):
    
    ml=len(string)
    sl=len(sub_string)
    c=0
    for i in range(ml-sl+1):
        if (string[i:(i+sl)]== sub_string):
            c=c+1
    return c




