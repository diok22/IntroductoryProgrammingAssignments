import java.lang.Math;
import java.lang.Comparable;
import java.util.*;
import java.io.*;

class PrimeFactors {
  void generate(int n) {
    ArrayList<Integer> factors = new ArrayList<Integer>();
    int incrementer = n % 2 == 0 ? 1 : 2;
    for (int i = 1; i <= Math.sqrt(n); i += 1) {
        if (n % i == 0 ) {
            factors.add(i);
            if (i != n / i) {
                factors.add(n / i);
            }
        }
    }

    Collections.sort(factors);
    System.out.println(factors);
  }

  public static void main(String[] args) {
    PrimeFactors prime = new PrimeFactors();
    prime.generate(30);
  }


}
/**
class PrimeFactorsTestDrive {
  public static void main(String[] args) {
    PrimeFactors prime = new PrimeFactors();
    prime.generate(30);
  }

}
*/
