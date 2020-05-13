static int findPowerPrime(int fact, int p) 
{ 
    int res = 0; 
    while (fact > 0) {      
        res += fact / p; 
        fact /= p; 
    } 
    return res; 
} 
static int findPowerComposite(int fact, int n) 
{ 
    int res = Integer.MAX_VALUE; 
    for (int i = 2; i <= Math.sqrt(n); i++) {      
        
        int count = 0; 
        if (n % i == 0) { 
            count++; 
            n = n / i; 
        
        } 
  
        if (count > 0) { 
  
            // Maximum power of i that divides  
            // fact!. We divide by count to 
            // handle multiple occurrences of 
            // a prime factor. 
            int curr_pow = findPowerPrime(fact, i) / count; 
            res = Math.min(res, curr_pow); 
        } 
    } 
  
    // This condition is to handle 
    // the case when n is a prime 
    // number greater than 2. 
    if (n >= 2) { 
        int curr_pow = findPowerPrime(fact, n); 
        res = Math.min(res, curr_pow); 
    } 
  
    return res; 
} 
  
