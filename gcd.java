 static int gcd(int m, int n) {
        return n == 0 ? m : gcd(n, m % n);
    }
