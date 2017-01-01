class MiniJava {
    public static void main(String[] args) {
        Seq seq;
        seq = new Seq();
        seq.make_fib(15);
      	for(int i=0; i<15; i+=1)
        System.out.println(seq.get_fib(i));
    }
}

class Seq {
    int[] fib_saver;
    
    public int get_fib(int i) {
        return this.fib_saver[i];
    }
    
    private void calc_fib(int i) {
        fib_saver[i] = fib_saver[i-1] + fib_saver[i-2];
    }
    
    public void make_fib(int n) {
        fib_saver = new int[n+1];
        fib_saver[1] = 1;
        fib_saver[0] = 1;
        int j;
        j = 2;
        while(j <= n) {
            this.calc_fib(j);
            j += 1;
        }
    }
}
