 public static void calculate(int n, int m) {
        int j = 0;
        int sqt = (int) Math.sqrt(m);
        array = new int[sqt + 1];
        primes = new int[sqt + 1];

        for (int i = 0; i < sqt; i++)
            array[i] = 1;

        for (int i = 2; i <= sqt; i++) {
            if (array[i] == 1) {
                primes[j++] = i;

                for (int k = i+i; k <= sqt; k += i) {
                    array[k] = 0;
                }
            }
        }

        int diff = m-n+1;
        array = new int[diff];
        for (int i = 0; i < diff; i++)
            array[i] = 1;

        for (int k = 0; k < j; k++) {
            int div = n / primes[k];
            div *= primes[k];
            while (div <= m) {
                if(div>=n && primes[k]!=div)
                    array[div-n] = 0;
                div += primes[k];
            }
        }for (int i = 0; i < diff; i++) {
            if (array[i] == 1 && (i+n) !=1)
                System.out.println(i + n);
        }

    }
