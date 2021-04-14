//build function for segment tree    

public static int build(int node, int low, int high) {

        if (low == high) {
            seg[node] = arr[low];
            return 0;
        }
        int mid = (low + high) / 2;
        int x = build(2 * node + 1, low, mid);
        build(2 * node + 2, mid + 1, high);

        if (x == 0) {
            seg[node] = seg[2 * node + 1] | seg[2 * node + 2];
            return 1;
        } else {
            seg[node] = seg[2 * node + 1] ^ seg[2 * node + 2];
            return 0;
        }
    }

// point update function

    static int updateTree(long l, long r, int val, int stIdx, int arrIdx) {
        if (l == r) {
            seg[stIdx] = val;
            return 0;
        }
        long mid = (l + r) / 2;
        int depth;
        if (arrIdx <= mid) {
            depth = updateTree(l, mid, val, 2 * stIdx + 1, arrIdx);
        } else {
            depth = updateTree(mid + 1, r, val, 2 * stIdx + 2, arrIdx);
        }
      //any operation as required , here it is or and xor operation
        if (depth % 2 == 0) {
            seg[stIdx] = seg[2 * stIdx + 1] | seg[2 * stIdx + 2];
        } else {
            seg[stIdx] = seg[2 * stIdx + 1] ^ seg[2 * stIdx + 2];
        }
        return depth + 1;
    }
