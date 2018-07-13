import java.lang.Math;
import java.util.ArrayList;

class PrimeFactors {
  void generate(int n) {
    ArrayList<Integer> factors = new ArrayList<Integer>();
    for (int i = 2; i <= Math.sqrt(n); i += 1) {
        if (n % i == 0 ) {
            factors.add(i);
        }
    }
    System.out.println(factors);
  }

  public static void main(String[] args) {
    PrimeFactors prime = new PrimeFactors();
    prime.generate(30);
  }

}
