public class PrimeNumbersByTrialDivision {

    public static int nOfPrimes(int startValue, int endValue) {
        int currentNumber = startValue;
        int nOfRules = 1;
        int[] rules = new int[endValue-startValue];
        boolean isInTheRules;
        rules[0] = 2;
        rules[1] = 3;

        while (currentNumber <= endValue) {
            isInTheRules = false;
            for (int i = 0; i<nOfRules; i++) {
                if (currentNumber % rules[i] == 0) {
                    isInTheRules = true;
                    break;
                } else if (rules[i] >= Math.sqrt(currentNumber)) break;
            }
            if (!isInTheRules) {
                rules[nOfRules] = currentNumber;
                nOfRules++;
            }
            currentNumber++;
        }
        return nOfRules;
    }

    public static void main(String[] args) {
        long s1 = System.currentTimeMillis();
        System.out.println("Number of Primes between 2 and 1,000,000,000: "+nOfPrimes(2,1_000_000_000));
        System.out.println("Number of Primes Time = "+(System.currentTimeMillis()-s1));

        // returns 50,847,534 primes between 2 and 1,000,000,000
        // took 350,341 ms or about 5-6 minutes @ 1.8ghz
    }
}
