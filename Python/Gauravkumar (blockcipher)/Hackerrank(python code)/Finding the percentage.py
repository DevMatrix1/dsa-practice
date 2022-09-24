# Coded By Block_Cipher

# https://www.hackerrank.com/challenges/finding-the-percentage/problem

n = int(input())
stud_dict = dict()    

for i in range(n):
    tmp = input().split()
    name = tmp[0]
    stud_dict[name] = (float(tmp[1]), float(tmp[2]), float(tmp[3]))
    # def  marks_obt(a,b,c):
        # scores = list(map(float,line))
        # a+b+c / 3 = input().split()
    # return student_marks
name = input()
print('%.2f'% (sum(stud_dict[name]) / 3.0))
