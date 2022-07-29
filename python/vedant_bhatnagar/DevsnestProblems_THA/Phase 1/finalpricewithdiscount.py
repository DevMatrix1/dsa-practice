def solve(n, prices):
    # CODE HERE
    for i in range(n):
        # price = prices[i]
        # discount = 0
        for j in range(i+1, n):
            if prices[j] <= prices[i]:
                prices[i] = prices[i] - prices[j]
                break
    return prices


    # different approach
        next_smallprice = [0]
    st = [prices[-1]]

    for i in prices[n-2::-1]:
        while(st):
            if (st[-1] > i):
                st.pop()
            else:
                break
        if not st:
            next_smallprice.append(0)
        else:
            next_smallprice.append(st[-1])
        st.append(i)

    next_smallprice.reverse()
    for i in range(n):
        prices[i] = prices[i] - next_smallprice[i]
    return prices    
