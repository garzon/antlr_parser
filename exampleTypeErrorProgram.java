class MiniJava {
    public static void main(String[] args) {
        Seq seq = new NotSeq();   // error
        // polymorphism
        Seq seq = new SeqSubClass();  // ok
        int a = 1 + seq.returnTrue(seq.returnTrue()) * 3;
        for(int b = seq.a; b; b += 1);
    }
}

class NotSeq {}
class Seq { public boolean returnTrue(int b) { return true; } }
class SeqSubClass extends Seq { int a; }