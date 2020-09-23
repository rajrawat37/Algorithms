   
//Recursive Approach 
static int lps(char ch[], int i, int j) {  
        if (i == j) { 
            return 1; 
        } 
        if (ch[i] == ch[j] && ch.length==2) { 
            return 2; 
        } 
        if (ch[i] == ch[j]) { 
            return lps(ch, i + 1, j - 1) + 2; 
        } 
        return Math.max(lps(ch, i, j - 1), lps(ch, i + 1, j)); 
    } 
  
//DP Approach
 static int lps(String ch) 
    { 
    int n = ch.length(); 
    int i, j, cl; 
    int L[][] = new int[n][n];  
    for (i = 0; i < n; i++) 
        L[i][i] = 1; 
        for (cl=2; cl<=n; cl++) 
        { 
            for (i=0; i<n-cl+1; i++) 
            { 
                j = i+cl-1; 
                if (ch.charAt(i) == ch.charAt(j) && cl == 2) 
                L[i][j] = 2; 
                else if (ch.charAt(i) == ch.charAt(j)) 
                L[i][j] = L[i+1][j-1] + 2; 
                else
                L[i][j] = max(L[i][j-1], L[i+1][j]); 
            } 
        } 
              
        return L[0][n-1]; 
    } 
