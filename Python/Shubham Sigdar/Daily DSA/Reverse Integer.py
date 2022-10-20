class Solution:
    def reverse(self, n: int) -> int:
        sign=1
        reverses=0
        if n<0:
            sign=-1
            n=-1*n
        while n>0:
            rem=n%10
            reverses=reverses*10+rem
            n//=10
        if not -2147483648 < reverses <2147483647:
            return 0
        return reverses*sign