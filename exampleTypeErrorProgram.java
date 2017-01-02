class MiniJava {
    public static void main(String[] args) {
        Seq seq = new NotSeq();   // error
        // polymorphism
        Seq seq2 = new SeqSubClass();  // ok
        int a = 1 + seq2.returnTrue(seq2.returnTrue()) * 3;
        boolean b = (1+seq2.a);
        int c; int d;
        for(c = 1; c; d += 1);
    }
}

class NotSeq { public int test() { return test(); }}
class Seq { public boolean returnTrue(int b) { return true; } }
class SeqSubClass extends Seq { int a; }