Q:https://leetcode.com/problems/roman-to-integer/submissions/


def romanToInt(self, s: str) -> int:
        roman_val = {'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000}
        value = 0
        
        for i in range(0, len(s)-1):
            
            # If we have low value char before higher value then it should be subtracted
            # Like 'IV' or 'IX' or 'CM'
            if(roman_val[s[i]] < roman_val[s[i+1]]):
                value -= roman_val[s[i]]
            # Else add up the value of character like 'XII or 'MX'
            else:
                value += roman_val[s[i]]
                
        value += roman_val[s[-1]]
        return value
        