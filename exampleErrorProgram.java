
class MiniJava {
    public static void main(String[] args) {
        Seq err = new Seq().Seq(false);
        Seq seq = new Seq().Seq(20);
        int k
        int l;
        for(l=0; l<=15; l+=1)
            System.out.println(seq.get_fib(l);
        System.out.println seq.calc_fib(10);
        seq.fib_saver = new int[100];
        int z = seq.do_not_exist;
        int shouldBeBool = 1;
        if(shouldBeBool) {
            int m = l.length;
        }
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
    
    private void calc_fib() {
        // error. overloaded.
    }
}

class Seq {
    int a;int a;
    int a;int a;
    int a;int a;
    int a;int a;
    int a;int a;
}

%%%