//Approach 1

static void primefactors(int k)
   {
        for (int i = 2; k != 1; i++) {
            while (k % i == 0) {
                k = k / i;
                System.out.print(i + " ");
            }
        }
        
//Approach 2

static void primefactors(int n)
  {
         while (n%2==0) 
        { 
            System.out.print(2 + " "); 
            n /= 2; 
        } 
        for (int i = 3; i <= Math.sqrt(n); i+= 2) 
        { 
            while (n%i == 0) 
            { 
                System.out.print(i + " "); 
                n /= i; 
            } 
        } 
        if (n > 2) 
            System.out.print(n); 
    }
    
 //Approach 3
 
 static void primeFactors(int k)
