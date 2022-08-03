def solve(n, prices):
    # CODE HERE
    maxprofit=0
    minprice=9999999
    for price in prices:
        if (price-minprice) > maxprofit:
            maxprofit = price-minprice
        if(price < minprice):
            minprice=price
    return maxprofit