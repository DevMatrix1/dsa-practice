
def solve(n, prices):
    max_element=0
    min_element=9999999
    for price in prices:
        max_element=max(max_element,price-min_element)
        min_element=min(price,min_element)
    return max_element