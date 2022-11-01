The stack holds all subproblems. The stack gets popped every loop and the possible children of the popped item get appended back on.
The items in the stack are tuples with the following makeup: [parenthesis string, open remaining, closed remaining].
We initialize the stack with ["(", n-1, n] because every valid parenthesis combination starts with "(".
Once an item x is popped from the stack, we check if it is complete by checking if the number of open remaining and closed remaining are zero. If it is complete, we append the string stored in x[0] to the return array.
If not, we move to the next step. In the next step, we check if the number of open remaining (x[1]) is less than n. If so, we can append an open parenthesis to x[1], decrement the number of open parentheses remaining, and push it back on the stack.
Then, we can check x again to see if the number of closed parentheses remaining (x[2]) is greater than the number of open parentheses remaining (x[1]). If it is, we append a closed parenthesis to x[0], decrement the closed parenthesis counter, then push it back on the stack.
Our program finishes when the stack is empty. We return the array of finished strings.


QQ: https: // leetcode.com/problems/generate-parentheses/submissions/


def generateParenthesis(self, n: int) -> List[str]:
    rv = []
    stack = [("(", n-1, n)]

    while stack:
        item = stack.pop()

        s = item[0]
        o = item[1]
        c = item[2]

        if o == 0 and c == 0:
            rv.append(s)
        else:
            if o != 0:
                stack.append([s+"(", o-1, c])

            if o < c:
                stack.append([s+")", o, c-1])

    return rv
