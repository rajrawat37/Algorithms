  static void seive(int n){
       int n=sc.nextInt();
	     boolean[] prime = new boolean[n+1];
	     Arrays.fill(prime,true);
	     for(int i=2;i<=(int)Math.sqrt(n);i++){
	          if(prime[i]){
	               for(int k=i*i;k<=n;k+=i) 
	                prime[k]=false;
	          }
	     }
	     for(int j=2;j<prime.length;j++)
	      if(prime[j])
	       System.out.print(j+ " ");
	       System.out.println();
  }
