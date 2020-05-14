 //Approach 1 : Brute Force
 
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


//Approach 2 : Using  Euler’s product formula

static int phi(int n) 
{ 
    int result = n;  
    for (int p = 2; p * p <= n; ++p) 
    { 
            while (n % p == 0) 
                n /= p; 
            result -= result / p; 
    } 
    if (n > 1) 
        result -= result / n; 
    return result; 
} 
