class MiniJava {
    public static void main(String[] args) {
        Seq seq = new Seq().Seq(15);
        int k = 1
        int zero = (0
        int l
        for(l=0; l<=7; l+=1)
            System.out.println(seq.get_fib(l));
        k /= 0;
    }
}

class Seq {
    int[] fib_saver;
    
    // function behave like a constructor
    public Seq Seq(int n) {
        fib_saver = new int[n+1];
        fib_saver[1] = 1;
        fib_saver[0] = 1;
        for(int j=2; j<=n; j+=1)
            this.calc_fib(j);
        return this;
    }
    
    public int get_fib(int i) {
        return this.fib_saver[i];
    }
    
    private void calc_fib(int i) {
        fib_saver[i] = fib_saver[i-1] + fib_saver[i-2];
    }
}
