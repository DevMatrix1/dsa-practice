def solve(n, nums):
    # CODE HERE
    ans = {}
    if n < 3:
        return []
    else:
        for i in range(0, len(nums)):
            sum = nums[i]
            target = 0 - sum
            track = {}
            for j in range(len(nums)):
                if j == i:
                    continue
                needed = target - nums[j]
                if needed in track:
                    triplets = (nums[i],nums[j],needed)
                    triplets = tuple(sorted(triplets))
                    if triplets not in ans:
                        ans[triplets] = 1
                        # print(ans)
                else:
                    track[nums[j]] = j

    set_ans = set(tuple(ans.keys()))
    # print(set_ans)
    ans = list(set_ans)
    return sorted(ans)
