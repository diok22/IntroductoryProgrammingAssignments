class DiamondExercises {

  void isoscelesTriangle(int n) {
    String asterisks = "";
    for (int i = 1; i < n * 2; i += 2) {
        for (int x = 1; x < (n - (i / 2)); x++) {
            asterisks +=(" ");
        }
        for (int x = 0; x < i; x++) {
          asterisks +=("*");
        }
        asterisks +=("\n");
    }
    System.out.println(asterisks);
  }

}

class DiamondExercisesTestDrive {
  public static void main(String[] args) {

    DiamondExercises diamond = new DiamondExercises();

    System.out.println("Given a number n, print a centered triangle");
    diamond.isoscelesTriangle(3);
  }
}
