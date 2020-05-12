 static int seive(int n){
       boolean [] compste= new boolean[n+1];
       for(int i=2;i*i<=n;i++){
            for(int j=i*i;j<=n && !compste[i];j+=i)
                 compste[j]=true;
       }
	     for(int j=2;j<cmpste.length;j++)
	      if(!compste[j])
	       System.out.print(j+ " ");
	       System.out.println();
  }
