# MiniJava Interpreter
A interpreter of (a superset of) MiniJava language powered by ANTLR V4.6

## Demo
Input program:
```java
class MiniJava {
    public static void main(String[] args) {
        Seq seq = new Seq().Seq(15);
        for(int i=0; i<=15; i+=1)
            System.out.println(seq.get_fib(i));
    }
}

class Seq {
    int[] fib_saver;
    
    // something like constructor
    public Seq Seq(int n) {
        fib_saver = new int[n+1];
        fib_saver[1] = 1;
        fib_saver[0] = 1;
        for(int j=2; j<=n; j+=1)
            this.calc_fib(j);
        System.out.println(fib_saver);
        return this;
    }
    
    public int get_fib(int i) {
        return this.fib_saver[i];
    }
    
    private void calc_fib(int i) {
        fib_saver[i] = fib_saver[i-1] + fib_saver[i-2];
    }
}
```

Got output:
```
[int(1), int(1), int(2), int(3), int(5), int(8), int(13), int(21), int(34), int(55), int(89), int(144), int(233), int(377), int(610), int(987)]
1
1
2
3
5
8
13
21
34
55
89
144
233
377
610
987
```
