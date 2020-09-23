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
  
