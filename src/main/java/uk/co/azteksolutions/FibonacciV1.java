package uk.co.azteksolutions;

/**
 * @author Asif Akhtar
 * 09/05/2020 14:04
 */
public class FibonacciV1 {
    public int nthFibonacciTerm(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        return nthFibonacciTerm(n - 1) + nthFibonacciTerm(n - 2);
    }
}
