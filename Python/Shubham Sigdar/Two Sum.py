# 1. Brute force method(Time Complexity->o(n^2)
def solve(n, nums, target):
    for i,el1 in enumerate(nums):
        for j,el2 in enumerate(nums):
            if el1 + el2 == target and i!=j:
                return [min(i,j), max(i,j)]

# 2. Dictionary/Hashmap
# target = 24
# arr=[2,3,3,7,8,22]
# 24-2=22//not in dictionary
# 24-3=21//
# 24-7=17//
# 24-8=16//
# 24-22=2//in dictionary return [2,22]
# {2:0, 3:2, 7:1, 8:1,  }


def solve(n, nums, target):
      m={}
      for i,el in enumerate(nums):
          if target-el in m:
              return [m[target-el],i]
          m[el]=i