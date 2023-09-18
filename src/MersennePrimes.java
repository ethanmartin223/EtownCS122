public class MersennePrimes {

    public static int findMersennePrimes(int powerEnd) {
        long currentValue;
        int c=0;
        for (int i = 2; i < powerEnd; i++) {
            currentValue = (long)Math.pow(2,i)-1;
            if (isPrime(currentValue)) {
                System.out.println("2^"+i+"-1 "+currentValue+" - Prime");
                c++;
            } else System.out.println("2^"+i+"-1 "+currentValue);
        }
        return c;
    }

    private static boolean isPrime(long n) {
        if (n > 2 && n%2 == 0) return false;
        for (long i = 3; i <= Math.sqrt(n); i+=2) if (n%i==0)return false;
        return true;
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("\nTotal primes found = "+findMersennePrimes(64));
        System.out.println("Time taken = "+(System.currentTimeMillis()-startTime)+"ms");
    }
}
