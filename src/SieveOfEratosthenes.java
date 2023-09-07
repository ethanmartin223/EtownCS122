public class SieveOfEratosthenes {

    public static int nOfPrimes(int endPoint) {
        boolean[] primes = new boolean[endPoint];
        int count = 0;
        primes[0] = true;
        primes[1] = true;
        for (int i = 0; i < primes.length; i++) {
            if (!primes[i]) {
                count++;
                for (int j = i+i; j < primes.length; j+=i) primes[j] = true;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println(nOfPrimes(1_000_000));
        System.out.println(System.currentTimeMillis() - startTime);
    }
}
