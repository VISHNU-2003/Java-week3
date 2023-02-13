package recursion;

public class Fibonacci {

    static int fib(int n)
    {
        if(n<2) return n;
//        if(n==0)return 0;
//        if(n==1)return 1;
        int a = fib(n-1);
        int b = fib(n-2);
        return a + b;
    }
    public static void main(String[] args) {
        int n =7;
        System.out.println(fib(n));
    }
}
