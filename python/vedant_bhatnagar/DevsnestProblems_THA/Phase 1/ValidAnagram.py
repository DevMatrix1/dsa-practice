def solve(s1, s2):
    # CODE HERE
    dict1 = {}
    dict2 = {}

    for i in s1:
        if i in dict1:
            dict1[i] += 1
        else:
            dict1[i] = 1

    for i in s2:
        if i in dict2:
            dict2[i] += 1
        else:
            dict2[i] = 1

    if dict1 == dict2:
        return 1
    else:
        return 0        