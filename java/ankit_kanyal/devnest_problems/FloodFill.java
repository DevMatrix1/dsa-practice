// link- https://devsnest.in/algo-challenges/flood-fill

static int[][] solve(int[][] image, int sr, int sc, int color){
//CODE HERE 

    if (image[sr][sc] == color) return image;
        fill(image, sr, sc, image[sr][sc], color);
        return image;
}

public static void fill(int [][] image,int sr,int sc,int color,int newColor){

    if(sr<0 || sr>=image.length || sc<0 || sc>=image[0].length || image[sr][sc]!=color) return ;

    image[sr][sc]=newColor;
    fill(image,sr+1,sc,color,newColor);
    fill(image,sr,sc+1,color,newColor);
    fill(image,sr-1,sc,color,newColor);
    fill(image,sr,sc-1,color,newColor);
}