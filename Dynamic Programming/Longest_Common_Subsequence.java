   static int lcs(int p, int q, String s1, String s2){
        
        int [][]dp= new int[p+1][q+1];
        for(int i=0;i<=q;i++)
          dp[0][i]=0;
        for(int i=0;i<=p;i++)
           dp[i][0]=0;  
           
           
         for(int i=1;i<=p;i++){
              for(int j=1;j<=q;j++){
                   char ch1=s1.charAt(i-1);
                   char ch2=s2.charAt(j-1);
                   if(ch1==ch2)
                      dp[i][j]=1+dp[i-1][j-1];    
                   else
                      dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
              }
         }
         return dp[p][q];
    }
}
