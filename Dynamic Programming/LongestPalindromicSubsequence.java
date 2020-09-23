    static int lps(char seq[], int i, int j) {  
        if (i == j) { 
            return 1; 
        } 
        if (seq[i] == seq[j] && i + 1 == j) { 
            return 2; 
        } 
        if (seq[i] == seq[j]) { 
            return lps(seq, i + 1, j - 1) + 2; 
        } 
        return Math.max(lps(seq, i, j - 1), lps(seq, i + 1, j)); 
    } 
  
