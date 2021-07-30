//Genric type

class Pair<T,U> {
    T key;
    U value;

    Pair(T a, U b) {
        this.key = a;
        this.value = b;
    }

    void set(T a, U b) {
        this.key = a;
        this.value = b;
    }

    Pair get() {
        return this;
    }
}

//non-genric type
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
        
        //First Column -:
        
            // Ascending order : this.x-p.x
            //Descending order : p.x-this.x
        
        //Second column -:
          
            //Ascending order : this.y-p.y
            //Descending order : p.y-this.y;

        public int compareTo(Pair p){
            return this.x-p.x;  
        }
    }
}
