public class assignment1 {

  public static void main(String[] args) {
    System.out.println(args);
  }

  public static long ModExpRec(long a, long j, long n) {
    if (j < 1L) {
      return 1L;
    } else {
      long result = ModExpRec(a, j / 2L, n);
      result = result * result % n;
      return j % 2L == 0L ? result : result * a % n;
    }
  }
}