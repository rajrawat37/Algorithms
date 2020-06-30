   static int lis(int[] arr, int n) {
        int[] tail = new int[n];
        tail[0] = arr[0];
        int len = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] < tail[0])
                tail[0] = arr[i];
            else if (arr[i] > tail[len - 1]) {
                tail[len] = arr[i];
                len++;
            } else {
                tail[bin_end_idx(tail, 0, len, arr[i])] = arr[i];
            }
        }
        return len;
    }
    static int bin_end_idx(int []tail,int low,int high,int key) {
        while ((high - low) > 1) {
            int m = low + (high - low) / 2;
            if (tail[m] >= key)
                high = m;
            else
                low = m;
        }
        return high;
    }
