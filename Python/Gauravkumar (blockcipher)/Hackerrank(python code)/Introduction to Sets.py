# Coded By Block_Cipher

# https://www.hackerrank.com/challenges/py-introduction-to-sets/problem

def average(array):
        sum = 0.0
        array = set(array)
        for i in array:
                sum += i
        sum/=len(array)
        return sum        

