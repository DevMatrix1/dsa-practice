# For each element, just check whether its equal to the element just diagonally above it, i.e., for all matrix[i][j] for i,j>0, check whether its equal to matrix[i-1][j-1]
# Same problem can also be solved the other way around, by comparing the element with next diagonal element below it, i.e., for all matrix[i][j] for i,j<len(matrix)-1, check whether its equal to matrix[i+1][j+1]
# Complexity

# By comparing with the diagonally previous element
class Solution(object):
    def isToeplitzMatrix(self, matrix):
        for i in range(1, len(matrix)):
            for j in range(1, len(matrix[i])):
                if matrix[i][j] != matrix[i-1][j-1]:
                    return False
        return True
# By comparing with the diagonally next element


class Solution(object):
    def isToeplitzMatrix(self, matrix):
        for i in range(len(matrix)-1):
            for j in range(len(matrix[i])-1):
                if matrix[i][j] != matrix[i+1][j+1]:
                    return False
        return True


# Time complexity:
# O(n*m) [n=len(matrix), m=len(matrix[0])]

# Space complexity:
# O(1)
