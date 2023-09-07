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
        long s1 = System.currentTimeMillis();
        System.out.println("Number of Primes between 3 and 1,000,000: "+nOfPrimes(1_000_000));
        System.out.println("Number of Primes Time = "+(System.currentTimeMillis()-s1));
    }
}
