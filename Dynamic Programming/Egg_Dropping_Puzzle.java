class EggDrop 
{
    static int eggDrop(int n, int k) 
	{   
	    int [][]dp= new int[n+1][k+1];
        
        for(int i=1;i<=n;i++){
             for(int j=1;j<=k;j++){
                  if(i==1)
                     dp[i][j]=j;
                  else if(j==1)
                     dp[i][j]=1;
                     else{
                           dp[i][j]=Integer.MAX_VALUE;
                          
                           for(int a=j-1,b=0;a>=0;a--,b++){
                                int eggsBroken=dp[i][a];  //egg survives
                                int eggsSurvived=dp[i-1][b]; //egg breaks
                                int temp=1+Math.max(eggsBroken,eggsSurvived);
                                dp[i][j]=Math.min(dp[i][j],temp);
                           }
                     }
             }
        }
        return dp[n][k];
    }
}
