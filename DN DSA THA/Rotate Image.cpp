vector<vector<int>> solve(vector<vector<int>> mat){
//CODE HERE 
for(int i=0;i<mat.size();i++){
      for(int j=i;j<mat[0].size();j++){
          swap(mat[i][j],mat[j][i]);
      }
   }
   for(int i=0;i<mat.size();i++){
       reverse(mat[i].begin(),mat[i].end());
   }
   return mat;
}
