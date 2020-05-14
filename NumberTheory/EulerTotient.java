 //Approach 1
 
 static int gcd(int a, int b) 
    { 
        return a==0?b:gcd(b % a, a); 
    } 
    
    static int phi(int n) 
    { 
        int result = 1; 
        for (int i = 2; i < n; i++) 
            if (gcd(i, n) == 1) 
                result++; 
        return result; 
    } 
