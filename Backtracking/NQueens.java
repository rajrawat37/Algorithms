       static int []cL;
       static int []rD;
       static int []lD;
       static char [][]ans;
       public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
              int n = sc.nextInt();
              cL = new int[n]; //col
              rD = new int[n + n - 1]; //right diagonal
              lD = new int[n + n - 1]; //left diagonal
              ans = new char[n + 1][n + 1];
              for(int i=0;i<n;i++)
                     Arrays.fill(ans[i],'N');
              solve(n, 0);
       }

       static void solve(int n,int row){
              if(row==n) //when all n queens are placed we can print the arrangement
              {
                     for(int i=0;i<n;i++){
                            for(int j=0;j<n;j++){
                                   System.out.print(ans[i][j]);
                            }
                            System.out.println();
                     }
                     System.out.println();
                     return;
              }
              for(int col=0;col<n;col++){
                     if(cL[col]==0 && rD[row+col]==0 && lD[row-col+n-1]==0) {
                            cL[col] = 1;
                            rD[row + col] = 1; 
                            lD[row - col + n - 1] = 1; //for indexing we take (row-col+n-1)  or (row+col ) , can be derived by pen-paper .
                            ans[row][col] = 'Q';
                            solve(n, row + 1);
                            cL[col] = 0;
                            rD[row + col] = 0;
                            lD[row - col + n - 1] = 0;
                            ans[row][col] = 'N';
                     }
              }
       }
//problem about placing n queens on n*n chessboard
//this method uses backtracking
//It is a Branch & Bound problem
