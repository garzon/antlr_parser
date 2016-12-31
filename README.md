# MiniJava Interpreter
A interpreter of (a superset of) MiniJava language powered by ANTLR V4.6

## Demo
Input program:
```java
class MiniJava {
    public static void main(String[] args) {
        Seq seq;
        seq = new Seq();
        seq.make_fib(15);
        System.out.println(seq.get_fib(15));
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
        System.out.println(fib_saver);
    }
}
```

Got output:
```
[int(1), int(1), int(2), int(3), int(5), int(8), int(13), int(21), int(34), int(55), int(89), int(144), int(233), int(377), int(610), int(987)]
987
```
