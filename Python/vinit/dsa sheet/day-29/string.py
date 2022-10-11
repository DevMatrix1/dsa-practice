def maxOdd(self, s):
        # for i in range(len(s) - 1, -1, -1) :
        #     if s[i] in {'1','3','5','7','9'} :
        #         return s[:i+1]
        # return ''
        # We have to just find the last index of an odd number, then slice the number upto that index,  becuase an odd number always ends with a number which is not divisible by 2 :)
        
        # Lets take the last index of an odd number as -1
        last_index = -1
        
        # Iterate through all the numbers for finding a odd number that appears on the last.
        for i , j in enumerate(s[::-1]):
            if(int(j) % 2 != 0):
                last_index = len(s) - i
                break
        # If there is no odd number, return empty string.
        if(last_index == -1): 
            return ""
                
        # Or return the string upto that index.
        return(s[:last_index])