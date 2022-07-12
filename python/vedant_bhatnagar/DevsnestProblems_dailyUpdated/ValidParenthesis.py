def solve(str):
    # CODE HERE
    stack = []
    for el in str:
        n = len(stack)
        if el == "(" or el == "[" or el == "{":
            stack.append(el)
        if ((el == ")" or el == "]" or el == "}") and n==0):
            return 0
        if el == ")":
            if stack[-1] == "(":
                stack.pop()
                continue
            return 0
        if el == "]":
            if stack[-1] == "[":
                stack.pop()
                continue
            return 0
        if el == "}":
            if stack[-1] == "{":
                stack.pop()
                continue
            return 0
    if len(stack) == 0:
        return 1
    else:
        return 0


#shorter approach
def solve(str):
    # CODE HERE
    stack = []
    m = {"(":")", "{":"}", "[":"]"}
    for el in str:
        if el in m:
            stack.append(el)
        else:
            if len(stack) > 0:
                if m[stack[-1]] == el:
                    stack.pop()
                else:
                    return 0
            else:
                return 0
    if len(stack) == 0:
        return 1
    else:
        return 0