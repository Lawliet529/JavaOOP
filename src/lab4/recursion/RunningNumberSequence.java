package lab4.recursion;

import java.util.Scanner;

/**
 * 2. Exercises on Recursion
 *
 * <p>2.3. Length of a Running Number Sequence (Recursive)
 */
public class RunningNumberSequence {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = input.nextInt();
    input.close();

    System.out.println("S(" + n + ") = " + len(n));
  }

  public static int len(int n) {
    if (n == 1) {
      return 1;
    }
    return len(n - 1) + numOfDigits(n);
  }

  public static int numOfDigits(int n) {
    int numOfDigits = 1;
    while ((n /= 10) > 0) {
      numOfDigits++;
    }
    return numOfDigits;
  }
}
