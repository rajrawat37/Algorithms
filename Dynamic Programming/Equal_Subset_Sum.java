 static int equalPartition(int N, int arr[])
    {
        int sum=0;
        for(int i=0;i<N;i++)
            sum+=arr[i];
        if(sum%2!=0)
           return 0;
        else{
           int [][]dp= new int[N+1][sum+1];
           for(int i=0;i<=N;i++)
                dp[i][0]=1;
            for(int i=1;i<=sum;i++)
                dp[0][i]=0;
           for(int i=1;i<=N;i++){
              for(int j=1;j<=sum;j++){
                   if(dp[i-1][j]==1)
                      dp[i][j]=1;
                   else if(j-arr[i-1]>=0 && dp[i-1][j-arr[i-1]]==1)
                     dp[i][j]=1;
            }
         }
          int count=0;
          for(int i=0;i<=N;i++){
               if(dp[i][sum/2]==1)
                 count++;
          }
          if(count>=2)
            return 1;
          else return 0;
       }
   }
