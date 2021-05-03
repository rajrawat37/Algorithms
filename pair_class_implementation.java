import java.util.*;

public class _pair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pair[] point = new Pair[3];  //A point array of type pair
        point[0] = new Pair(3, 7);
        point[1] = new Pair(2, 9);
        point[2] = new Pair(4, 8);

        Arrays.sort(point);

        for(int i=0;i<3;i++) {
            System.out.print(point[i].x + " " + point[i].y);
            System.out.println();
        }

        System.out.println();
    }
  
 
    static class Pair implements Comparable<Pair> {
        int x;
        int y;
        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int compareTo(Pair p){
            return this.x-p.x;   //to sort according to first column use x else to sort according to second column replace this line with return this.y-p.y;
        }
    }
}
