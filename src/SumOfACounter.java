class SumOfACounter {
    public static int summation(int n) {
        int c =0;
        for (int i = 1; i <= n; i++) c += i;
        return c;
    }

    public static void main(String[] args) {
        int n=11;
        System.out.println("Summation of n: "+summation(n));
        System.out.println("n^2/2: "+((n*n)/2));
        System.out.println("n*(n+1)/2: "+n*(n+1)/2);
        //n*(n+1)/2 is closer to the sum value
    }
}