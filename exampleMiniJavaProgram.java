class MiniJava {
    public static void main(String[] args) {
        Seq seq = new Seq().Seq(15);
        for(int i=0; i<=15; i+=1)
            System.out.println(seq.get_fib(i));
        System.out.println(seq.fib_saver);
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
