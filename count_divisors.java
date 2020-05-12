int c=0;
for (int j = 1; j <= (int) Math.sqrt(i) ; j++) {
                if (i % j == 0) {
                    if (i / j == j)
                        c += 1;
                    else
                        c += 2;
                }
            }
            
//Time Complexity : O(sqrt(n))
//Auxiliary Space : O(1)
