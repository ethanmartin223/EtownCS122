public class SimplePrimeNumberFinder {

    //78,498 between 0,1_000_000
    //50,847,534 between 0,1_000_000_000
    private static boolean isPrime(int n) {
        if (n > 2 && n%2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i+=2) if (n%i==0)return false;
        return true;
    }

    public static int nOfPrimes(int startValue, int endValue) {
        int c = 0;
        for (int i = startValue; i <= endValue; i++) {
            if (isPrime(i)) c++;
        }
        return c;
    }

    public static void main(String[] args) {
        long s1 = System.currentTimeMillis();
        System.out.println("Number of Primes between 3 and 1,000,000: "+nOfPrimes(3,1_000_000));
        System.out.println("Number of Primes Time = "+(System.currentTimeMillis()-s1));

        //Number of Primes between 3 and 1,000,000: 78497
        //largest prime found was 999,983
        //runtime was ~70ms to ~100ms
    }
}
