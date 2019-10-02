public class asg1 {

  public static void main(String[] args) {
    long a = Long.parseLong(args[0]);
    long j = Long.parseLong(args[1]);
    long n = Long.parseLong(args[2]);

//    System.out.println("Expected: " + mod(a, j));
//    System.out.println("Actual: " + mod(a, j));
    System.out.println(mod(pow(a, j), n));
  }

  // Much faster but still getting some problems with the incorrect answers :/ Think it might be a mod problem though
  private static long mod(long number, long divisor) {
    if (number < divisor) {
      return number;
    } else {
      long howManyTimes = number / divisor;
      return number - (howManyTimes * divisor);
    }
  }

// program times out, need to think of a more efficient way of doing it
//  private static long mod(long number, long divisor) {
//    if (number < divisor) {
//      return number;
//    } else {
//      while (number > divisor) {
//        number = number - divisor;
//      }
//    }
//    return number;
//  }

  // Runs quicker for the last few with the performance tuning but it still gives the wrong outcome for some reason :(
  // is it an overflow error? I am getting negative values...
  private static long pow(long base, long power) {
    if (power == 0) {
      return 1;
    } else if (power == 1) {
      return base;
    } else if (power % 2 == 0) {
      return pow(base * base, power / 2);
    } else {
      return base * pow(base * base, power / 2);
    }
  }

// Fails the third question and times out on the rest of them
//  private static long pow(long base, long power) {
//    long result = 1;
//    for (long i = 0; i < power; i++) {
//      result = result * base;
//    }
//    return result;
//  }

// Stack Overflow Error with large values, need to come up with a better way that uses less of the stack, for loop?
//  private static long pow(long base, long power) {
//    if (power == 1) {
//      return base;
//    } else {
//      return base * pow(base, power - 1);
//    }
//  }

}
