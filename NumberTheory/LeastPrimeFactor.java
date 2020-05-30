//  to find least prime factor of every number till n
//  for 1 lpf will be 1
//  all prime nmbrs as lpf as the nmbr itself , using this -
//  check if the nmbr is prime marks its lpf as the nmbr itself , like -
//  mark lpf for 2 as 2 and all multiples of 2 will have lpf as 2 
//  again mark lpf for 3(nxt nmbr) as 3(nmbr itself) and all multiples of 3 will have lpf as 3


static void leastPrimeFactor(int n)
{		
		int []lpf= new lpf[n+1];
		
		lpf[1]=1;
		
		for(int i=2 ; i*i<=n ;i++)           
		{
			if(lpf[i]==0)                      //check if nmbr is prime or not!
			{
				lpf[i]=i;

				for(int j=i*i ; j<=n ; j+=i)
				{
					if(lpf[j]==0)                  //if not marked then only mark it
						lpf[j]=i;
				}
			}
		}
		
		for(int i=1 ; i<=n ; i++)
		{
				System.out.print(lpf[i]==0 ? i + " ": lpf[i] + " ");
		}
}
