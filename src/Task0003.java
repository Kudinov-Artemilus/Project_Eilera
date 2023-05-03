/*


Простые делители числа 13195 - это 5, 7, 13 и 29.

Каков самый большой делитель числа 600851475143, являющийся простым числом?

 */
public class Task0003 {
    public static void main(String[] args) {
        System.out.println(new Task0003().run());
    }
    public String run() {
        long n = 600851475143L;
        while (true) {
            long p = smallestFactor(n);
            if (p < n)
                n /= p;
            else
                return Long.toString(n);
        }
    }
    private static long smallestFactor(long n) {
        if (n <= 1)
            throw new IllegalArgumentException();
        for (long i = 2, end = (long) Math.sqrt(n); i <= end; i++) {
            if (n % i == 0)
                return i;
        }
        return n;
    }

}
