class MiniJava {
    public static void main(String[] args) {
        Seq seq = new FactorialSeq();
        int l = 99999999;
        for(l=0; l<=5; l+=1)
            System.out.println(seq.get(l));
        seq = new FibSeq().FibSeq(10);
        int j = 7;
        for(l=0; l<=j; l+=1)
            System.out.println(seq.get(l));
    }
}

class Seq {
    public int get(int i) { return -1; }
    private void calc(int i) { }
}

class FactorialSeq extends Seq {
    public int get(int i) {
        if(i < 2) return 1;
        else return this.get(i-1)*i;
    }
}

class FibSeq extends Seq {
    int[] saver;
    
    // a function that behaves like a constructor
    public FibSeq FibSeq(int n) {
        saver = new int[n+1];
        saver[1] = 1;
        saver[0] = 1;
        for(int j=2; j<=n; j+=1)
            this.calc(j);
        return this;
    }
    
    public int get(int i) {
        return this.saver[i];
    }
    
    private void calc(int i) {
        saver[i] = saver[i-1] + saver[i-2];
    }
}
