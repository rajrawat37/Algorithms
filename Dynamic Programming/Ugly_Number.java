long getNthUglyNo(int n) {
        long []ugly= new long[n];
        ugly[0]=1;
        long fac_2=2 , fac_3=3 , fac_5=5;
        int i2=0,i3=0,i5=0;
        for(int i=1;i<n;i++){
            long x=Math.min(Math.min(fac_2,fac_3),fac_5);  
            ugly[i]=x;
            if(x==fac_2){
                i2++;
                fac_2=ugly[i2]*2;
            }
             if(x==fac_3){
                i3++;
                fac_3=ugly[i3]*3;
            }
             if(x==fac_5){
                i5++;
                fac_5=ugly[i5]*5;
            }
        }
        return ugly[n-1];
   }
