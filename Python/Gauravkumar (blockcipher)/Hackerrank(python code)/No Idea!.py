# Coded By BLOCK_CIPHER
# https://www.hackerrank.com/challenges/no-idea/problem



n,m = input().split()
a = input().split()

x = set(input().split())
y = set(input().split())

print(sum([(i in x)- (i in y)for i in a]))




