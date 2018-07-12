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

  void centeredDiamond(int n) {
    isoscelesTriangle(n);
    String downAsterisks = "";
    for (int i = n * 2; i > 1; i -= 2) {
      for (int x = (n - (i / 2) + 1); x > 0; x--) {
        downAsterisks += (" ");
      }
      for (int x = i; x > 1; x--) {
        downAsterisks += ("*");
      }
      downAsterisks += ("\n");
    }
    System.out.println(downAsterisks);
  }


}

class DiamondExercisesTestDrive {
  public static void main(String[] args) {

    DiamondExercises diamond = new DiamondExercises();

    System.out.println("Given a number n, print a centered triangle");
    diamond.isoscelesTriangle(3);
    System.out.println("Given a number n, print a centered diamond");
    diamond.centeredDiamond(3);
  }
}
