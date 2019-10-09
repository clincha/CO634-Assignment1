public class asg1 {

  public static void main(String[] args) {
    long a = Long.parseLong(args[0]);
    long j = Long.parseLong(args[1]);
    long n = Long.parseLong(args[2]);

    System.out.println(breaker(a, j, n));
  }

  /**
   * Calculates a^j mod n (Modular Exponentiation).
   * @param a The base value
   * @param j The exponent
   * @param n The modulo
   * @return a^j mod n
   */
  private static long breaker(long a, long j, long n) {
    if (j < 1)
      return 1;
    long result = breaker(a, j / 2L, n);
    result = (result * result) % n;
    return j % 2 == 0 ? result : result * a % n;
  }

}