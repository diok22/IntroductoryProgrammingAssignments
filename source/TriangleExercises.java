class TriangleExercises {

  void easiestExerciseEver() {
    System.out.println("*");
  }

  void drawAHorizonalLine(int n) {
    String asterisks = "";
    for (int i = 0; i < n; i++) {
      asterisks += "*";
    }
    System.out.println(asterisks);
  }

  void drawAVerticalLine(int n) {
    String asterisks = "";
    for (int i = 0; i < n; i++) {
      asterisks += ("*\n");
    }
    System.out.println(asterisks);
  }

  void drawARightAngle(int n) {
    String asterisks = "";
    for (int x = 0; x < n; x++) {
      for (int i = 0; i <= x; i++)
          asterisks +=("*");
          asterisks +=("\n");
    }
    System.out.println(asterisks);
  }


}


class TriangleExercisesTestDrive {
  public static void main(String[] args) {

    TriangleExercises triangle = new TriangleExercises();

    System.out.println("Print one asterisk to the console");
    triangle.easiestExerciseEver();
    System.out.println("Given Given a number n, print n asterisks on one line.");
    triangle.drawAHorizonalLine(8);
    System.out.println("Given a number n, print n lines, each with one asterisks");
    triangle.drawAVerticalLine(3);
    System.out.println("Given a number n, print n lines, each with one more asterisk than the last");
    triangle.drawARightAngle(3);
  }

}
