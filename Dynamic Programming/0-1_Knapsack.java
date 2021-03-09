static int knapSack(int W, int wt[], int val[], int n) 
    { 
         int [][]dp= new int[n+1][W+1];
         
         for(int i=0;i<=W;i++){
           dp[0][i]=0;
         }
         for(int i=0;i<=n;i++)
          dp[i][0]=0;
         
         for(int i=1;i<=n;i++){
              for(int j=1;j<=W;j++){
                  if(j-wt[i-1]>=0)
                    dp[i][j]=Math.max(dp[i-1][j],val[i-1]+dp[i-1][j-wt[i-1]]);
                  else
                     dp[i][j]=dp[i-1][j];
              }
         }
         return dp[n][W];
    } 
