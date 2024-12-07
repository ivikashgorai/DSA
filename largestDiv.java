class Codechef {
    // Function to find the largest divisor of a number other than itself
    public static long largestDivisor(long num) {
        long largestDiv = 1;
        for (long i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                largestDiv = Math.max(largestDiv, num / i);  // Take the larger divisor
            }
        }
        return largestDiv;
    }
}
