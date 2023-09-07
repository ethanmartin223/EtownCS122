public class PiCalculation {

    public static double taylorSeriesDouble(long nOfDigitsAcc) {
        double result = 0;
        long i = 1;
        boolean isOnMinus = true;
        while (nOfDigitsAcc >= 0) {
            result += isOnMinus?(4d/i):-(4d/i);
            isOnMinus =! isOnMinus;
            i+=2;
            nOfDigitsAcc--;
        }
        return result;
    }

    public static float taylorSeriesFloat(long nOfDigitsAcc) {
        float result = 0;
        long i = 1;
        boolean isOnMinus = true;
        while (nOfDigitsAcc >= 0) {
            result += isOnMinus?(4f/i):-(4f/i);
            isOnMinus =! isOnMinus;
            i+=2;
            nOfDigitsAcc--;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println("Pi using 1,000 terms using doubles: "+taylorSeriesDouble(1_000));
        System.out.println("Pi using 100,000 terms using doubles: "+taylorSeriesDouble(100_000));
        System.out.println("Pi using 1,000,000 terms using doubles: "+taylorSeriesDouble(1_000_000));

        System.out.println("\n");

        System.out.println("Pi using 1,000 terms using floats: "+taylorSeriesFloat(1_000));
        System.out.println("Pi using 100,000 terms using floats: "+taylorSeriesFloat(100_000));
        System.out.println("Pi using 1,000,000 terms using floats: "+taylorSeriesFloat(1_000_000));
    }
}
