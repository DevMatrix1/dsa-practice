def solve(image , sr, sc, color):
    # CODE HERE
    original = image[sr][sc]
    if original == color:
        return image

    image[sr][sc] = color
    if sr>0 and image[sr-1][sc] == original:
        solve(image, sr-1,sc,color)
    if sr<len(image)-1 and image[sr+1][sc] == original:
        solve(image, sr+1,sc,color)
    if sc>0 and image[sr][sc-1] == original:
        solve(image, sr,sc-1,color)
    if sc < len(image[0])-1 and image[sr][sc+1] == original:
        solve(image, sr,sc+1,color)
    return image