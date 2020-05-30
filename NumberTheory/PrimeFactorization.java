//Approach 1

static void primefactors(int n)
   {
        for (int i = 2; n != 1; i++) {
            while (n % i == 0) {
                n = n / i;
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
 
   // first find the least prime factor of that number and then divide it revursivly with that number
   //using seive ; useful for multiple queries
    static void seive(){
         int []least = new int[n+1];
         least[1]=1;
       
        for(int i=2;i*i<=n;i++){
             if(least[i]==0){
                 least[i]=i;
                 for(int j=i*i;j<=n;j+=i){
                     if(least[i]==0)
                         least[j]=i;
                 }
             }
        }
    }
    
      // by dividing by smallest prime factor recursively
    static Vector<Integer> getFactorization(int x) 
    { 
        Vector<Integer> ret = new Vector<>(); 
        while (x != 1) 
        { 
            ret.add(least[x]); 
            x = x / least[x]; 
        } 
        return ret; 
    } 
