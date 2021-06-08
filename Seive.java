// 1

 static ArrayList<Integer> sieve(int n) {

        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime,true);

        ArrayList<Integer> prime = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                prime.add(i);
                for (int j = i + i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        return prime;
    }

// 2


static int seive(int n){
       boolean [] compste= new boolean[n+1];
       for(int i=2;i*i<=n;i++){
            for(int j=i*i;j<=n && !compste[i];j+=i)
                 compste[j]=true;
       }
	     for(int j=2;j<compste.length;j++)
	      if(!compste[j])
	       System.out.print(j+ " ");
	       System.out.println();
  }
